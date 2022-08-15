package ex03.multi;

import ex02.Interface.IDraw;
import ex08.Abstract.Shape;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		mc.draw();
		mc.show("YoungSam Kim");
		mc.show("taehawn Park");
		
		System.out.println("------------");
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.su);
		
		System.out.println("------------");
		Shape s = new MultiClass();
		s.show("Yuna Kim");
	}

}
