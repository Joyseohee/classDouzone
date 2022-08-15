package ex07.Abstarct;

public class Triangle extends Shape {
	int h = 10, w = 20;
	
	@Override
	public double calc() {
		result = (h * w) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("Triangle의 넓이 : " + result +"인 삼각형을 그렸습니다.");
	}

}
