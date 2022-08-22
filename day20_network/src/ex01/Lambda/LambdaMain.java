//package ex01.Lambda;
//
//// parameter X/ return type O
//interface Message1 {
//	int something();
//}
//
//class Person1 {
//	public void greeting(Message1 msg) {
//		int su = msg.something();
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LambdaMain {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person1 p = new Person1();
//		p.greeting(new Message1() {
//			
//			@Override
//			public int something() {
//				System.out.println("good morning");
//				return 300;
//			}
//		});
//		System.out.println("***********************************");
////		public int sum(int x, int y) { return x + y; }
////		(x, y) -> {x + y}
//		
//		p.greeting(() -> {
//			System.out.println("good morning");
//			return 50;
//		});
//	}
//}
