package quiz.three;

import java.util.Scanner;

//Student class - 학과, 학번, 학년
public class Student extends Person {
	public Scanner sc = new Scanner(System.in);
	private int stuN, year;
	private String major;
	public int getStuN() {
		return stuN;
	}
	public void setStuN(int stuN) {
		this.stuN = stuN;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void process() {
		System.out.println("이름을 입력하세요");
		setName(sc.next());
		System.out.println("키를 입력하세요");
		setHeight(sc.nextInt());
		System.out.println("몸무게를 입력하세요");
		setWeight(sc.nextInt());
		System.out.println("학과를 입력하세요");
		setMajor(sc.next());
		System.out.println("학년을 입력하세요");
		setYear(sc.nextInt());
		System.out.println("학번을 입력하세요");
		setStuN(sc.nextInt());
		disp();
	}
	
	public void disp() {
		System.out.println("Person [name=" + name + ", height=" + height + ", weight=" + weight + "]" + "\nStudent [stuN=" + stuN + ", year=" + year + ", major=" + major + "]");
	}
}
