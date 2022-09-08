package quizInheritance;

import java.util.Scanner;

// 사번, 이름, 부서, 연락
public class Employee {
	protected int num;
	protected String name, dep, phone;
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
		num = 12345;
		name = "이름";
		dep = "부서";
		phone = "01000000000";
	}
	
	public void input() {
		System.out.println("nun = "); this.num = sc.nextInt();
		System.out.println("name = "); this.name = sc.next();
		System.out.println("dep = "); this.dep = sc.next();
		System.out.println("phone = "); this.phone = sc.next();
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dep=" + dep + ", phone=" + phone + "]";
	}
	
	

}
