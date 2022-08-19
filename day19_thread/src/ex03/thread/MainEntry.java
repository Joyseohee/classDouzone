package ex03.thread;

public class MainEntry {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		int priority = Thread.currentThread().getPriority();	// default priority = 5
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 name : " + name);
		System.out.println("현재 스레드 state : " + state);
		System.out.println("현재 스레드 priority : " + priority);
	}
}
