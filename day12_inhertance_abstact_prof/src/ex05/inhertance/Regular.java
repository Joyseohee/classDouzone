package ex05.inhertance;

public class Regular extends Employee {
	
	protected int pay;

	public Regular() {
		//super.input();
		/*System.out.print("pay = ");					
	    pay = sc.nextInt();*/
		input();
	}
	public void input() {
		super.input();  // Employee class input method call
		System.out.print("pay = ");					
		this.pay = sc.nextInt();
	}

	public Regular(int empNO, String name, String dept, String phone, int pay) {
		super(empNO, name, dept, phone);
		this.pay = pay;
	}

	public Regular(int pay) {
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void disp() {
		super.disp();
		System.out.println("급여 : " + pay);
	}
}



