package ex02.runnable;

public class UserRunnable implements Runnable {

	String name;
	
	public UserRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
//		System.out.println("runnable call the method 'run()'");
		
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
				try {
					Thread.sleep(1000);	// generate Exception, 1/1000초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(i + 1);
		}
	}

}
