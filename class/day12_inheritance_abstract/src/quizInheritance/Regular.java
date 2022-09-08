package quizInheritance;

// 급여
public class Regular extends Employee {
	protected int pay;
	
	public void input() {
		super.input();
		System.out.println("pay = "); this.pay = sc.nextInt();
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRegular [pay=" + pay + "]";
	}

}
