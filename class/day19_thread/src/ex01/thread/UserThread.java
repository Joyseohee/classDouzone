package ex01.thread;

// 직접 구현하는 스레드
public class UserThread extends Thread {
	String name;

	public UserThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {	// Implement thread
		
		for (int i = 0; i < 10; i++) {
			if(i == 6) {
				try {
					sleep(1000);	// generate Exception, 1/1000초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i + 1);
		}
//		super.run();// 부모의 run 호출
	}
}
