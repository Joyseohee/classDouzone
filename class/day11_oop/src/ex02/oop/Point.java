package ex02.oop;

public class Point {
	private int x, y; 	// private < default < protected < public
						// private이라도 같은 class 안에 있으면 사용할 수 있다.
	// 생성자 함수 : 멤버 변수 초기화
	public Point() {
		x = 9;
		y = 8;
	}

	public void setData(int x, int y) {
//		x = x;		// this를 안 붙이면 모두 매개변수 x로 인식
		this.x = x;	// this를 붙여야 멤버변수에 매개변수 대입 연산	
		this.y = y;
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

	public void display() {
		System.out.println(getX() + " : " + getY());
	}
}
