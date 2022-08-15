package ex02.inhertance;

import java.util.Scanner;

public class Employee {
	// 사원정보
	protected int idNum; // 사번
	protected String name; // 이름
	protected int department; // 부서
	protected String phoneNum; // 연락처
	
	public Employee() {
		input();
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원의 사번을 입력해주세요.");
		idNum = sc.nextInt();

		System.out.println("사원의 이름을 입력해주세요.");
		name = sc.next();

		System.out.println("사원의 부서을 입력해주세요. (1. 내근직 2. 외근직)");
		department = sc.nextInt();

		System.out.println("사원의 연락처를 입력해주세요.");
		phoneNum = sc.next();
	}

	@Override
	public String toString() {
//		input();
		return "사번 : " + idNum + " 사원 이름 : " + name + " 부서 : " + department + " 연락처 " + phoneNum;
	}

}
