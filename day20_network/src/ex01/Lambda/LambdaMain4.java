package ex01.Lambda;

// There`s the situation that must written return type

interface Message {
	void something(int x, int y);	// setting parameter
//	void good(int x);
}

interface Talk {
	void something(String x, String y);	// functional interface(interface that has only one method)
//	void good(int x);
}

class Person {
	public void greeting(Message msg) {
		msg.something(80, 30);
//		msg.good(50);
	}
	public void greeting(Talk msg) {
		msg.something("hello", "world");
	}
}

public class LambdaMain4 {
	public static void main(String[] args) {
		Person p = new Person();
		p.greeting(new Message() {
			
			@Override
			public void something(int x, int y) {
				System.out.println("parameter value : " + x + ", " + y);
			}
			
//			@Override
//			public void good(int x) {
//				System.out.println("parameter value : " + x);
//			}
		});
		System.out.println("-------------------------------------");
		char ch = 'a';
		
		p.greeting((int x, int y) -> {	// message interface, should declare parameter type(Talk is String)
			System.out.println("parameter value : " + x + ", " + y);
		});
		
		p.greeting((String x, String y) -> {	// Talk interface
			System.out.println("parameter value : " + x + ", " + y);
		});
		
		p.greeting((String x, String y) -> {	// Talk interface
			System.out.println("parameter value : " + x + ", " + y);
			System.out.println(ch);
//			ch = 'b';	// 람다에서는 변수 값 변경할 수 없다.
			num = 222;
			System.out.println(num);	// main 함수 밖에서 선언한 static 변수값은 변경할 수 있다.	
		});
	}
	static int num = 30;
}
