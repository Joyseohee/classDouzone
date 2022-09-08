package quiz.one;

import java.util.Scanner;

public class Sawoen {
	
	private String name, depart, phoneNum ;   // 멤버변수
	private int pay, no;  
	
	// constructor
	public Sawoen() {  // default constructor method
		name = "noName";
		depart = "전산";
		phoneNum = "000-0000-0000";
		pay = 10000;
		no = (int)(Math.random() * 10) + 1;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	// output method
	public void display() {
		String members = "Sawoen [name=" + name + ", depart=" + depart + ", phoneNum=" + phoneNum 
				+ ", pay=" + pay + ", no=" + no	+ "]";
		System.out.println(members);
	}
	
	// input mehtod
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("name : ");		this.name = sc.next();
		System.out.print("depart : ");		setDepart(sc.next());
		System.out.print("phoneNum : ");	setPhoneNum(sc.next());
		System.out.print("pay : ");			this.pay = (int)(Math.random() * 10) + 10000;	
		System.out.println("saNo : ");	    no = (int)(Math.random() * 10) + 1;	
	}
	
}




