package ex07.inheritance;

public class Rect extends Point {
	//사각형 넓
	private int x3, y3;
	
	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public Rect() {
		x3 = y3 = 5;
	}
	
	public void cal() {
		System.out.println("사각의 넓이는 " + (x3 - x) * (y3 -y) + "다.");
	}

}
