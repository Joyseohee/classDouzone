package ex07.Abstract;

public abstract class Shape {		//abstract class, Super class
	double result = 0;
	public abstract double calc();	//abstract method
	public abstract void draw();
	
	public void show() {	//general method
		System.out.println("Super class shape");
	}
}
