package ex03.multi;

import ex02.Interface.IDraw;
import ex08.Abstract.Shape;

public class MultiClass extends Shape implements Test, IDraw {
	
	String irum = "이순신";
	
	
	@Override
	public void draw() {
		System.out.println("IDraw Interface method");

	}

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class method method");
		return x;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.println(name + " shape abstact class method");

	}

}
