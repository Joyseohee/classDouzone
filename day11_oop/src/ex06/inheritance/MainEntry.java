package ex06.inheritance;

class Point {	// super class
	protected int x, y;	// 보호모드 - 상속받은 자손은 접근 가능
	
	public Point() {
		System.out.println("Point default constructor");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
}// Point end

class Circle extends Point {	// sub class : inherited by super class.
	private int r;
	public Circle() {
		System.out.println("Circle default constructor");
	}
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
}//Circle end

class Rect extends Point {	// sub class : inherited by super class.
	private int x2, y2;
	public void disp() {
		System.out.println(x + ", " + y + ", " + x2 + ", " + y2);
	}
}//Circle end


public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setX(5);
		c.disp();
		
		Rect r = new Rect();
		r.disp();
	}

}
