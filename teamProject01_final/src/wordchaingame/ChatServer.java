package wordchaingame;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

    public class ChatServer {  // outer class

        HashMap clients ;   // key, value
       
        public ChatServer() {  //2번
            // 생성자 함수
            clients = new HashMap();  // HashMap 객체 생성
            Collections.synchronizedMap(clients);   //  동기화
        }

        public void start() {   // user method
            ServerSocket ss = null;   // sever socket 1
            Socket s = null;    // client socket 2
            try {
                ss = new ServerSocket(7778);
                System.out.println("서버 시작 되었습니다. 끝말잇기 시작 하겠습니다!!");
                while(true) {
                    s = ss.accept();  // 응답대기, 클라이언트 소켓
                    System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
                    ServerReceiver thread = new ServerReceiver(s);  // user class
                    thread.start();   // Thread method - run() 메소드 유도된다.
                } // while end
            } catch (Exception e) {  e.printStackTrace();   }
        } // end start()

        public void sendToAll(String msg) { //특정 클라이언트로부터 메세지가 도착했을 때, 해시맵에 있는 모든 클라이언트에게 해당 메세지를 전송한다.
            Iterator it = clients.keySet().iterator(); //key값들을 받아온다.

            while( it.hasNext() ) {	// 요소가 있다면....
                try {
                    DataOutputStream dos = (DataOutputStream)clients.get(it.next());  // 현재 연결되어있는 client의 OutputStream을 받아온다.
//				System.out.println("dos.toString = "+ dos.toString());
                    dos.writeUTF(msg+"\n");  //클라이언트와 연결된 outputstream에 UTF형식으로 메세지를 입력하고, 전송한다.
                } catch (Exception e) {  e.printStackTrace();   }
            }
        } // end sendToAll()

        class ServerReceiver extends Thread {    // inner class
            Socket s ;  // client socket
            DataInputStream dis;   // readXXX();   - XXX : 자료형
            DataOutputStream dos;   // writeXXX();

            public ServerReceiver(Socket s) {  // 생성자함수
                this.s = s;
                try {
                    dis = new DataInputStream(s.getInputStream());  // 네트워크 통해서 읽기
                    dos = new DataOutputStream(s.getOutputStream());  // 네트워크 통해서 쓰기
                } catch (Exception e) {  e.printStackTrace();   }
            } // end constructor

            @Override
            public void run() {  // 스레드 실행부(구현부)
                String name = "";
                try {
                    name = dis.readUTF();
                    sendToAll("#"+ name + " 님이 입장하셨습니다.");  //

//				System.out.println(dos.toString().hashCode());
                    clients.put(name, dos);   // HashMap 넣기
                    System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다."); // 접속자 수 확인
                    if (clients.size()>=2)
                    	System.out.println("끝말잇기를 시작하겠습니다.");
                    
                    while(dis!=null) {
                        sendToAll(dis.readUTF()); //dis.readUTF()가 빈 문자열을 받았을 때, sendToAll이 호출되는지 (보류)

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sendToAll("#" + name + " 님이 나가셨습니다.");
                    clients.remove(name);   // 접속자 수 제거하기
                    System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 종료 하셨습니다.");
                    System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
                }
            } // end run()
        } // end ServerReceiver

        public static void main(String[] args) {
            new ChatServer().start();
        } //1번 TCP 채팅 서버를 시작한다. 2번으로

    }

