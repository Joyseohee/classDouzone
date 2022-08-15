package ex06.oop;

import java.util.Scanner;

public class Score {
	private Scanner sc = new Scanner(System.in);
	// 멤버변수 선언
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int com = 0;
	private int total = 0;
	private double avg = 0;
	private char grade = 0;

	// 각 멤버변수의 멤버함수
	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTotal() {
		total = kor + eng + com;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		avg = total / 3.0;
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		grade = 0;
		switch ((int) (avg / 10)) {
		case 9:
			grade = 'A';
			return grade;
		case 8:
			grade = 'B';
			return grade;
		case 7:
			grade = 'C';
			return grade;
		case 6:
			grade = 'D';
			return grade;
		default:
			grade = 'F';
			return grade;
		}
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	// 출력함수
	public void output() {
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
		System.out.println(", 학점 : " + grade);
		System.out.println();
	}
}
