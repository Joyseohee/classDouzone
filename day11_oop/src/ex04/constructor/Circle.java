package ex04.constructor;

public class Circle {
	private int x, y, r;

	
	
	// constructor method 3
	public Circle() {
//		x = y = r = 5;
		this(5, 5, 5);
	}

	public Circle(int x) {
//		this.x = r;
		this(x, 9, 8);

	}
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
		r = 5;
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void print() {
		System.out.println("Circle [x=" + x + ", y=" + y + ", r=" + r + "]");
	}

	

}
