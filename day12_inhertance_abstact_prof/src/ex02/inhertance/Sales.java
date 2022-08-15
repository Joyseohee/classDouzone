package ex02.inhertance;

import java.util.Scanner;

public class Sales extends Regular {
	// 영업사원의 커미션, 수수료 급여의 몇 프로
	private double commission; // 수수료 3프로?

	public double getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public void input() {
		super.input();
		if (super.department == 2) {
			input2();
			salary += (salary * commission);
		} else if (super.department == 1) {
			System.out.println("내근직으로 커미션은 없습니다. ");
		}

	}

	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("커미션을 입력해주세요");
		commission = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + " 영업직 commission : " + commission;
	}
}
