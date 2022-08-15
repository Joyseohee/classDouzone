package ex05.inhertance;

import java.util.Scanner;

public class Employee {
	
	protected int empNO;
	protected String name, dept, phone;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() { // 생성자함수는 명시적으로 호출 불가능, 객체생성시 자동호출됨(1회)
//		input();
	}
	
	public void input(){   // 입력 메소드 
		System.out.print("empNO = ");		 		this.empNO= sc.nextInt();	 //num = sc.nextInt();
		System.out.print("name = ");				setName(sc.next());
		System.out.print("dept = ");				setDept(sc.next());
		System.out.print("phone = ");				this.phone = sc.next();		
	}
	
	public Employee(int empNO, String name, String dept, String phone) {
		super();
		this.empNO = empNO;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}

	public Employee(int empNO) {
		this(empNO, null, null, null);
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	/*@Override
	public String toString() {
		return "Employee [empNO=" + empNO + ", name=" + name + ", dept=" + dept + ", phone=" + phone + ", sc=" + sc
				+ "]";
	}*/
	
	public void disp() {
		System.out.println("사원 번호 :" + empNO + "\n이름 : " + name);
		System.out.println("부서 :" + dept + "\n연락처 : " + phone);
	}
}
