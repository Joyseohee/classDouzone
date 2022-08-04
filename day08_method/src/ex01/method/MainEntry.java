package ex01.method;

public class MainEntry {
	
	// method는 main에서 호출하지 않으면 나타나지 않는다.
	public static void line() {
		System.out.println("------------------------");
	}
	
	
	public static void main(String[] args) {
		display();									// 함수 호출
		line();
		display();
		line();
		display();
		line();
		display();
		line();
		
		showName("Yuna Kim", 32);
		showName("Teahwan Park", 32);
	}
	
	// @ parameter x & return type x
	
	public static void display() {					// 함수 정의
		System.out.println("happy doyeon");
	}
	
	
	// @ parameter o & return type x
	public static void showName(String name, int age) {
		System.out.println("Your name is " + name + ".\n" + "Your age is " + age + ".");
		System.out.println("**************************");
	}
	
	
}
