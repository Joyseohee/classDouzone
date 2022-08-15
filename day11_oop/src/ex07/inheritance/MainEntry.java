package ex07.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		
	
	Point pt = new Point();
	Rect r = new Rect();
	TriAngle tri = new TriAngle();
	Circle c = new Circle();
	
	pt.setX(15);
	pt.setY(10);
	c.setR(3);
	c.cal();
	tri.setX2(20);
	tri.cal();
	r.setX3(23);
	r.setY3(20);
	r.cal();
	
	
	}
}
