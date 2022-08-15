package ex06.api;

class Circle {
	int x, y;
	
}

public class EqualsMethod {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		
		if(c1 == c2) System.out.println("same");
		else System.out.println("not same");
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
//		if(x == y

				
	}
}
