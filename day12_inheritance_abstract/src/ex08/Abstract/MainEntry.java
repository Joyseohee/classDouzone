package ex08.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각 클래스로 객체 생성해서 호출
		new Circle().show("원");
		
		Rect r = new Rect();
		r.show("Rect");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
//		Shape s = new Shape();	// abstract : 자체적으로 객체생성할 수 없다.
		
		System.out.println("**********");
		
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle(); 	//new Shape는 안 되지만 상속받은 것으로는 호출할 수 있다.
		sh.show("Circle");
		
		sh = new Rect();
		sh.show("Rect");
		
		sh = new Triangle();
		sh.show("Triangle");
		
		System.out.println("**********");
		
		// 3. Using an array
		Shape[] s = new Shape[3];	// declare array
		
		s[0] = new Circle();
		s[1] = new Rect();
		s[2] = new Triangle();
		
		String[] name = {"Circle", "Rectangle", "Triangle"};
		for (int i = 0; i < s.length; i++) {
			s[i].show(name[i]);
		}
	}
}
