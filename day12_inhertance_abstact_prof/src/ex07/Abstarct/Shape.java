package ex07.Abstarct;

public abstract class Shape {  // abstract class, Super class

	protected double result = 0;
	
	public abstract double calc();  // 추상메소드
	public abstract void draw(); 
	
	public void show() {
		System.out.println("Super class Shape");
	}
}
