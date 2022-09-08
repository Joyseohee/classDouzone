/*
package quiz.three;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Professor prof = new Professor();
		Student s = new Student();

		while (true) {
			System.out.println("교수면 p, 학생이면 s를 입력하세요");
			char id = sc.next().charAt(0);
			p.setId(id);
			
			if (p.getId() == 'p') {
				prof.process();
			} else if (p.getId() == 's') {
				s.process();
			} else {
				System.out.println("p나 s만 입력하세요");
			}
			System.out.println("더 입력하시겠습니까? y/n");
			char q = sc.next().charAt(0);
			if(q == 'n') break;
		}
	}
}
//*/
//*
package quiz.three;

import java.util.Scanner;


public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Professor prof = new Professor();
		Student s = new Student();

		while (true) {
			System.out.println("교수면 p, 학생이면 s를 입력하세요");
			char id = sc.next().charAt(0);
			p.setId(id);
			
			if (p.getId() == 'p') {
				System.out.println("이름을 입력하세요");
				p.setName(sc.next());
				System.out.println("키를 입력하세요");
				p.setHeight(sc.nextInt());
				System.out.println("몸무게를 입력하세요");
				p.setWeight(sc.nextInt());
				System.out.println("교수번호를 입력하세요");
				prof.setProfN(sc.nextInt());
				System.out.println("직급을 입력하세요");
				prof.setPosition(sc.next());
				System.out.println("담당학과를 입력하세요");
				prof.setMajor(sc.next());
				prof.disp();
			} else if (p.getId() == 's') {
				System.out.println("이름을 입력하세요");
				s.setName(sc.next());
				System.out.println("키를 입력하세요");
				s.setHeight(sc.nextInt());
				System.out.println("몸무게를 입력하세요");
				s.setWeight(sc.nextInt());
				System.out.println("학과를 입력하세요");
				s.setMajor(sc.next());
				System.out.println("학년을 입력하세요");
				s.setYear(sc.nextInt());
				System.out.println("학번을 입력하세요");
				s.setStuN(sc.nextInt());
				s.disp();
			} else {
				System.out.println("p나 s만 입력하세요");
			}
			System.out.println("더 입력하시겠습니까? y/n");
			char q = sc.next().charAt(0);
			if(q == 'n') break;
		}
	}
}

//*/
