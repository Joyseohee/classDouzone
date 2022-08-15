package ex07.Abstract;

public class Triangle extends Shape {
	int h = 10;
	int w = 10;
	
	@Override
	public double calc() {
		result = h * w / 2;;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이가 " + result + "인 삼각형을 그렸습니다.");
	}

}
