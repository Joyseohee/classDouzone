package inhertance;

import java.util.Scanner;

public class Sales extends Regular {
	
	private double commision, result;

	public Sales() {
		System.out.print("commision(실수형 입력요망) = ");		
		commision = sc.nextDouble();
	}

	public Sales(int empNO, String name, String dept, String phone, int pay, double commision) {
		super(empNO, name, dept, phone, pay);
		this.commision = commision;
	}

	public Sales(double commision) {
		this.commision = commision;
	}
	
	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	
	public double getResult() {
		return result;
	}

	public double getResult(int pay, double commision) {
//		return super.getPay() * commision;
		return pay * commision;
	}

	public void disp() {
		double result2 = getResult(super.pay, commision);
		super.disp();
		System.out.println("commision : " + (commision) 
											+ "% , 총 급여 : " + (super.pay + result2));
	}
}
