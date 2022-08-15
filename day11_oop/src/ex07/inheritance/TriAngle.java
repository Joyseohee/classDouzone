package ex07.inheritance;

public class TriAngle extends Point {
	//삼각형의 넓이
	private int x2;
	
	public TriAngle() {
		x2 = 5;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void cal() {
		System.out.println("삼각형의 넓이는 " + (x2 - x) * y / 2+ "다.");
	}
}
