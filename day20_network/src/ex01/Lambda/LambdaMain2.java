//package ex01.Lambda;
//
//// parameter X/ return type O
//interface Message {
//	int something(int x);	// setting parameter
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(80);
//		System.out.println("Number is " + su);
//	}
//}
//
//public class LambdaMain2 {
//	public static void main(String[] args) {
//		// Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {
//			@Override
//			public int something(int x) {
//				System.out.println("parameter value : " + x);
//				return 100;
//			}
//		});
//		
//		System.out.println("***********************************");
////		public int sum(int x, int y) { return x + y; }
////		(x, y) -> {x + y}
//		
//		p.greeting((x) -> {	// no need to declare the parameter type, also no need to use ()
//			System.out.println("parameter value : " + x);
//			return 50;
//		});
//	}
//}
