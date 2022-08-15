package ex06.Abstract;


abstract class Shape {
	double result = 0;
	public abstract double calc();	//abstract method
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class shape");
	}
}

class Circle extends Shape {
	// Must override abstract method
	// declaration part
	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}	// circle end

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

class Point {
	
}

class Rec extends Point {
	
}

public class MainEntry {
	public static void main(String[] args) {
		Shape s = new Circle();
		s = new Triangle();
		
		// 자체적으로 객체 생성할 수 없다.
//		Shape s = new Shape();
	}
	
}
