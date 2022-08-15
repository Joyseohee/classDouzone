package ex07.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		//self declaration 
//		Circle c = new Circle();
//		c.draw();
		
		//same with upper process
		new Circle().draw();
		new Rectangle().draw();
		new Triangle().draw();
	}

}
