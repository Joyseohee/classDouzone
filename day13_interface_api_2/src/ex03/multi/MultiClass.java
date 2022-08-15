package ex03.multi;

import ex02.Intreface.IDraw;
import ex08.Abstract.Shape;

public class MultiClass 
				extends Shape implements Test, IDraw {
	
	String irum = "이순신";

	@Override
	public void draw() {  // IDraw interface
		System.out.println("IDraw interface method");
	}

	@Override
	public double calc(double x) {  // shape abstract class
		System.out.println("shape abstract class method");
		return x;
	}

	@Override
	public void tshow(String name) {   // Test interface
		calc(5.5);
		System.out.println(name + " Test interface method");
	}

	@Override
	public void show(String name) {  // shape abstract class
		System.out.println("shape abstract class method");
		System.out.println(name + " hi!!! ");
		
	}

}
