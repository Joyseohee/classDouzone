package ex05.opp;

public class Point {
	// 멤버 변수
	private int x, y;
	
	// 멤버 함수
	public int getX() {
		return x;
	}
	public void setX(int xx) {
		x = xx;
	}
	public int getY() {
		return y;
	}
	public void setY(int yy) {
		y = yy;
	}
	
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}
