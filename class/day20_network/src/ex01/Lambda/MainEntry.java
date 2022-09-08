//package ex01.Lambda;
//
////parameter X/ return type X
//
//interface Message {
//	void something();
//}
//
//class Person {
//	void greeting(Message msg) {
//		msg.something();	// nothing to call
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		p.greeting(new Message() {
//			
//			@Override
//			public void something() {
//				System.out.println("good morning");
//			}
//		});
//		System.out.println("***********************************");
////		public int sum(int x, int y) { return x + y; }
////		(x, y) -> {x + y}
//		
//		p.greeting(() -> {
//			System.out.println("good morning");
//		});
//	}
//}
