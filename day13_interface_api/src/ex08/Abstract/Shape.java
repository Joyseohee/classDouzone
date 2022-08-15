package ex08.Abstract;

public abstract class Shape {
	
	protected double result = 0;
	
	public abstract double calc(double x);  // abstract method
	public abstract void show(String name); 
	
	public void view() {
		System.out.println("super class Shape 입니다.");
	}

}
