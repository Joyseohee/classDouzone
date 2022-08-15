package ex02.inhertance;

import java.util.Scanner;

public class Regular extends Employee {
	// 급여 정보
	protected int salary; // 급여

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("급여를 입력해주세요");
		salary = sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + " 급여 : " + salary;
	}
}
