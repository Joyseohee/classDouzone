package ex01.oop;
import java.lang.*;	// automatically import

public class MainEntry extends Object {
	public static void main(String[] args) {
		Point pt = new Point();	// create object, allocate in Memory, invocate method
		pt.setX(100);
		pt.setY(30);
//		System.out.println(pt.getX() + ", " + pt.getY());
		pt.setData(2, 5);
		pt.display();
		pt.setData(2, 10);
		pt.setY(100);
		pt.display();
		
		Circle c = new Circle();
		c.x = 3;
		c.y = 5;
		System.out.println(c.x + ", " + c.y);
		
	}

}

class Circle {
	int x, y;		// 
	
}

class Point {
	private int x, y;		// private < default < protected < public
							// private이라도 같은 class 안에 있으면 사용할 수 있다.
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int xx) {
		x = xx;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void display() {
		System.out.println(getX() + " : " + getY());
	}
}
