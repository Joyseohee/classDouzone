package ex03.oop;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	// 사번, 이름, 직급, 부서, 급여, 연락처
	private int inwon;
	private int num, pay;
	private String name, hier, department, phoneNum;

	// setter, getter method

	public int getInwon() {
		return inwon;
	}

	public void setInwon(int inwon) {
		this.inwon = inwon;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHier() {
		return hier;
	}

	public void setHier(String hier) {
		this.hier = hier;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	// input
	
	public void input() {
		System.out.println("사번 = ");
		setNum(sc.nextInt());
		System.out.println("이름 = ");
		setName(sc.next());
		System.out.println("직급 = ");
		setHier(sc.next());
		System.out.println("부서 = ");
		setDepartment(sc.next());
		System.out.println("월급 = ");
		setPay(sc.nextInt());
		System.out.println("연락처 = ");
		setPhoneNum(sc.next());
	}
	
	// print
	public void print() {
		System.out.println("이름 : " + getName() + ", 사번 : " + getNum() + ", 직급 : " + getHier());
		System.out.println("부서 : " + getDepartment() + ", 급여 : " + getPay() + ", 연락처 : " + getPhoneNum());
		System.out.println("*****************************************");
	}

}
