package ex04.constructor;

public class CircleMain {
	public static void main(String[] args) {
		
	
	
	Circle c1 = new Circle();	// create object, allocate in the Memory,invocate constructor method1 
	Circle c2 = new Circle(8);
	Circle c3 = new Circle(10, 10);
	Circle c4 = new Circle(15, 15, 15);
	
	c1.print();
	c2.print();
	c3.print();
	c4.print();
	
	
	}	
}
