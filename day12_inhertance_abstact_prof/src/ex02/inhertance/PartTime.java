package ex02.inhertance;

import java.util.Scanner;

public class PartTime extends Employee {
	// 근무일 수 * 시간당 단가
	Scanner sc = new Scanner(System.in);

	private int day, tprice, total;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTprice() {
		return tprice;
	}

	public void setTprice(int tprice) {
		this.tprice = tprice;
	}

	@Override
	public void input() {
		super.input();
		System.out.print("일한 일 수 입력 : ");
		day = sc.nextInt();
		System.out.print("시급 입력 : ");
		tprice = sc.nextInt();
		user();
	}

	public void user() {
		total = day * tprice;
	}

	@Override
	public String toString() {
		return super.toString() + "\n급여 : " + total;
	}
}
