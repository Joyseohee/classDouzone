package practice;

import javax.swing.JOptionPane;

//Main Class
public class ThreadEx2 {
	public static void main(String[] args) throws Exception {
		ThreadEx7 th1 = new ThreadEx7();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class ThreadEx7 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 10; i--) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (Exception e) {}
		}
	}
}
