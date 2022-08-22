//package ex01.Lambda;
//
//// parameter X/ return type O
//interface Message {
//	int something(int x, int y);	// setting parameter
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(80, 30);
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LambdaMain3 {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//			@Override
//			public int something(int x, int y) {
//				System.out.println("parameter value : " + x + ", " + y);
//				return 100;
//			}
//		});
//		
//		System.out.println("***********************************");
////		public int sum(int x, int y) { return x + y; }
////		(x, y) -> {x + y}
//		
//		p.greeting((x, y) -> {	// no need to declare the parameter type
//			System.out.println("parameter value : " + x + ", " + y);
//			return x + y;
//		});
//	}
//}
