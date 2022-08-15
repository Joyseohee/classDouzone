package quiz.three;

import java.util.Scanner;

//Professor  클래스 - 교수번호, 직급(전임,조교수,외래교수), 담당학과
public class Professor extends Person {
	public Scanner sc = new Scanner(System.in);
	private int profN;
	private String position, major;
	public int getProfN() {
		return profN;
	}
	public void setProfN(int profN) {
		this.profN = profN;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
		System.out.println("교수번호를 입력하세요");
		setProfN(sc.nextInt());
		System.out.println("직급을 입력하세요");
		setPosition(sc.next());
		System.out.println("담당학과를 입력하세요");
		setMajor(sc.next());
		disp();
	}
	
	public void disp() {
		System.out.println("Person [name=" + name + ", height=" + height + ", weight=" + weight + "]" + "\nProfessor [profN=" + profN + ", position=" + position + ", major=" + major + "]");
	}
	
}
