package ex06.net.game;
//기본형 완성품 끝말 사전 중복단어

import controller.GAMEDICController;
import controller.KRDICController;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatPlayer4 {

	
	static String word = null;
	static String word2 = null;

	public static void main(String[] args) {

		// 로그인 제작시 여기서 합치면

		// 1번
		// args : 메인함수 실행 시 읽어오는 함수 인자.
		if (args.length != 1) { // args의 길이가 1이 아니라면 -> 연결된 클라이언트가 없다면 을 구현한 것이다.
			// 채팅 프로그램의 서버에 들어갈 고객 목록이 없기 떄문
			System.out.println("USAGE : java TcpMultiChatClient userName? "); // user 이름 확인 메세지를 띄운다.
			System.exit(0); // 시스템 종료
		}

		// 메인함수에 들여온 함수인자가 존재할 시
		try {
			KRDICController.connect(); // 국어사전에 등재된 단어인지
			GAMEDICController.connect();	// 이 게임내에서 중복되는 단어 사용 방지 ex)사자 ->자사-> 사자-> 자사
			
			String ip = "192.168.110.3"; // ip값 초기화
			Socket s = new Socket(ip, 7777); // Socket 객체 생성
			// 이때 생성되는 Socket은 TCP Socket이므로, 상대방 서버에서 accept를 호출할때까지 해당 구문에서 멈춰있는다.
			/**
			 * sender와 receiver가 분리되어 동작하도록 코딩하는 이유
			 *
			 * 소켓이 생성될 때, 소켓에 I/O작업을 할 수 있는 InputStream, OutputStream도 같이 생성된다. 싱글 스레드에서 받은
			 * 데이터가 있는지 확인하기 위해 while문을 사용할 경우 연결된 상대방이 보낸 데이터를 읽을때까지, 프로그램의 흐름이 멈춘다. 따라서
			 * 상대방이 보낸 데이터를 읽는 스레드와 메세지를 입력받아 상대방에게 전송하는 스레드를 분리하여 구현하면, 상대방의 데이터를 읽을때까지
			 * 프로그램이 멈춰있지 않게된다.
			 *
			 */

			// 이 코드에서 사용된 Socket객체의 description : Socket(InetAddress address, int port)
			System.out.println("server connect");

			Thread sender = new Thread(new ClientSender(s, args[0])); // thread객체 sender를 생성 : 생성된 객체 sender는
																		// ClientSender클래스 객체이다. 여기서 2번을 확인한다.
			Thread receiver = new Thread(new ClientReceiver(s));
			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main end
		// 2. ClientSender : 클라이언트에서 server에 무언가를 보내는 클래스

	static class ClientSender extends Thread { // inner class
		Socket s; // socket
		DataOutputStream dos; // dataoutputstream : 파일에 데이터를 입력한다.
		String name;

		public ClientSender(Socket s, String name) { // 생성자 함수
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream()); // Socket의 outputstream을 할당받는다. 즉 Socket에서 Data를 전송할 수
																	// 있는 방법을 가져온다.

				this.name = name;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() { // override 된것을 확인할 수 있다. 이는 Runnable interface의 run 함수를 오버라이딩한 것이다.
			// ClientSender는 thread클래스를 확장했기 때문에 부모 클래스인 thread클래스가 implements한 Runnable
			// 인터페이스를 사용할 수 있기 때문이다. (자식 클래스는 부모 클래스의 모든 기능을 상속받는다.)
			Scanner sc = new Scanner(System.in);
			try {

				if (dos != null)
					dos.writeUTF(name);// thread를 시작했을 때, 소켓의 outputstream이 열려있었다면, args로 입력받았던 name값을 전달한다.
				while (dos != null) {

					// 입력
					String a = sc.next();
					
					if (word != null) {//첫입력이 아니면(게임 진행중 이면)
						// 뒷말 앞말비교 + 사전에 있는 말인지+이번 게임에 사용된 단어가 아닌지
						if (word.charAt(word.length() - 2) == a.charAt(0) && KRDICController.gamecheck(a) == true
								&& GAMEDICController.gamecheck(a) == false) {
							dos.writeUTF(a);
							GAMEDICController.game(a);
						} else {
							if (word.charAt(word.length() - 2) != a.charAt(0)) {
								dos.writeUTF("[" + name + "] 단어: " + a + "는(은) 끝말 오류 lose");
							} else if (KRDICController.gamecheck(a) == false) {
								dos.writeUTF("[" + name + "] 단어: " + a + "는(은) 사전 오류 lose");
							} else if (GAMEDICController.gamecheck(a) == true) {
								dos.writeUTF("[" + name + "] 단어: " + a + "는(은) 중복 오류 lose");
							} else {
								dos.writeUTF("[" + name + "] 단어: " + a + "는(은) 오류발생");
							}
							GAMEDICController.truncateT();
						}

					} else {//게임이 이제 시작되는것이면
						System.out.println("첫단어: ");
						dos.writeUTF(a);
						GAMEDICController.game(a);
					} // 이후 while문을 돌면서, [이름]:채팅 내용 을 UTF형식으로 전송한다.
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end run()
	} // end ClientSender class

	// ClientRecevier는 thread를 확장하였다. -> thread클래스를 상속받았다.
	// 이 함수는 thread를 사용해 서버로부터 소켓(데이터)을 전달받는다.
	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis; // DataInputStream은 전달받은 데이터를 데이터타입별로 입력받는다.

		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 소켓에 생성된 InputStream을 DatainputStream으로 받아온다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (dis != null) { // * 현재 슬레드는 지속적으로 상대방 서버로부터 데이터가 오는지 확인하고, 만약 데이터가 왔다면 println으로 읽은 값을 출력한다.
				try {
					// 출력
					String read = dis.readUTF();
					System.out.println(read);
					// 이김
					if (read.charAt(0) == '[' || read.charAt(0) == '#') {
						System.out.println("새로운 도전자가 입장했습니다.");
						word = null;
						GAMEDICController.truncateT();
					} else {
						word = read;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	} // end ClientSender class

}