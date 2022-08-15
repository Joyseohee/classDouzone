package ex07.inheritance;

public class Circle extends Point{
	private int r;
	//원의 넓이
	
	public Circle() {
		r = 5;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void cal() {
		System.out.println("원의 넓이는 " + r * r * Math.PI + "다.");
	}
}
