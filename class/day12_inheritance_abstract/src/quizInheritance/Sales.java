package quizInheritance;

// 커미션을 1.5배
public class Sales extends Regular {
	private double comm;
	
	public Sales() {
		super();
		this.comm = 1.5;
		// TODO Auto-generated constructor stub
	}
	
	public void input() {
		super.input();
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	public double getR() {
		this.comm = super.getPay() * comm;
		return comm;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSales [comm=" + getR() + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
}
