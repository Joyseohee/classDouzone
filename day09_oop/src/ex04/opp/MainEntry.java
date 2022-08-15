package ex04.opp;

class Point {
	private int x, y;	// 멤버변수(클래스변수), 자동 초기화, 접근제어자 안 쓰면 default로 자동 지정
	
	// 멤버 함수 = getter / setter method
	public void setX(int xx) {
		x = xx;
	}
	public int getX() {
		return x;
	}
	public void setY(int yy) {
		y = yy;
	}
	public int getY() {
		return y;
	}
	public void display() {
		System.out.println(y + ", " + y);
//		System.out.println(getX() + ", " + getY());
	}
}

class Circle {
	private int x, y, r;
	
	//getter/setter
	public void setX(int xx) {
		x = xx;
	}
	public int getX() {
		return x;
	}
	public void setY(int yy) {
		y = yy;
	}
	public int getY() {
		return y;
	}
	public void setR(int rr) {
		r = rr;
	}
	public int getR() {
		return r;
	}
	//output
	public void display() {
		System.out.println(x + ", " + y + ", " + r);
	}
}

public class MainEntry {	// 1 package : 1 public class(main method class)
	public static void main(String[] args) {
		// Create object of Circle class and Print
		Circle cir = new Circle();
		cir.display();
		cir.setX(4);
		cir.setY(10);
		cir.setR(8);
		cir.display();
		
		Point pt = new Point();		// 객체 생성, 메모리에 할당, 생성자함수 자동 호출 : 객체를 만들어준다. 클래스 이름과 동일해야 한다.
		pt.display();
		pt.setX(10);
		pt.setY(5);
		pt.display();
		
		System.out.println(pt.getX() + ", " + pt.getY());	
		pt.setX(10);	// 수정하기
		pt.setY(5);
		System.out.println(pt.getX() + ", " + pt.getY());	// private에서도 가능(불러오기)
//		System.out.println(pt.x) + ", " + pt.y);			// private에서는 불능
//		int x  = 9;
	}
}
