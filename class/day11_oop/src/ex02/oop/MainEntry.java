package ex02.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();
		pt.setX(20);
		pt.setY(30);
		pt.display();
		System.out.println("*********************");
		
		Circle c = new Circle();
		c.setR(5);
		c.setX(100);
		c.setY(150);
		c.display();
		System.out.println("*********************");
		
		Rectangle r = new Rectangle();
		r.setX1(3);
		r.setX2(10);
		r.setY1(9);
		r.setY2(16);
		r.display();
		
	}
}
