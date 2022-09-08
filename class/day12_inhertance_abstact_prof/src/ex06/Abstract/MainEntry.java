package ex06.Abstract;


abstract class Shape {
	double result = 0;
	public abstract double calc();  // 추상메소드
	public abstract void draw(); 
	
	public void show() {
		System.out.println("Super class Shape");
	}
} // shape end

class Circle extends Shape {

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
} // circle end

class Triangle extends Shape {

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}


//class Point{
//	
//}
//class Rect extends Point {
//	
//}



public class MainEntry {
	public static void main(String[] args) {
		Shape s = new Circle();  //상속 받은 자손 클래스로는 객체 생성 할 수 있다 
		s = new Triangle();
		//자체적으로 객체 생성할 수 없다.
		//Shape s = new Shape();
	}
}
