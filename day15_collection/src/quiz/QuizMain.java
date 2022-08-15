package quiz;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * 문제] Customer class
   name, address, tel  field 
   생성자함수, set/get method

  ArrayList or Vector 이용해서 
  고객 추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.
 */

public class QuizMain {

	public static Scanner sc = new Scanner(System.in);
//	CustomerList c = new CustomerList();
	public static ArrayList<String> name = new ArrayList();
	public static ArrayList<String> add = new ArrayList();
	public static ArrayList<String> tel = new ArrayList();
	public static String cname = null;
	public static char ans2;
	public static int i;

	public static void main(String[] args) {

		do {
			System.out.println("어떤 작업을 수행하시겠습니까? 1. 고객 정보 추가 2. 고객 정보 삭제 3. 고객 리스트 출력 4. 고객 정보 수정 5. 프로그램 종료");
			int ans1 = sc.nextInt();
			switch (ans1) {
			case 1:
				addCustomer();
				break;
			case 2:
				delCustomer();
				break;
			case 3:
				printList();
				break;
			case 4:
				setCustomer();
				break;
			default:
				break;
			}
		} while (ans2 != 5);
		System.out.println("프로그램을 종료합니다.");
	}

	private static void setCustomer() {
		System.out.println("고객 정보를 수정하겠습니다.");
		System.out.println("정보를 수정할 고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println("이름을 수정하세요.");
		name.set(i, sc.next());
		System.out.println("주소를 수정하세요.");
		add.set(i, sc.next());
		System.out.println("연락처 수정하세요.");
		tel.set(i, sc.next());
		System.out.println("수정이 완료됐습니다.");
	}

	private static void printList() {
		System.out.println("고객 정보 리스트를 출력합니다.");
		System.out.println("리스트를 출력할 고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println("이름 : " + name.get(i) + "\n주소 : " + add.get(i) + "\n전화번호 : " + tel.get(i));
	}

	private static void delCustomer() {
		System.out.println("고객 정보를 삭제하겠습니다.");
		System.out.println("고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println(cname + "고객의 정보를 정말로 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다. 답변은 y 혹은 n로 입력해주십시오.");
		ans2 = sc.next().charAt(0);
		if(ans2 == 'y') {
			name.remove(cname);
			add.remove(i);
			tel.remove(i);
			System.out.println(cname + "님의 정보가 삭제됐습니다.");
		}
		System.out.println("이전 페이지로 돌아갑니다.");
	}

	private static void addCustomer() {
		System.out.println("고객 정보를 추가하겠습니다.");
		System.out.println("고객의 이름을 입력하세요.");
		name.add(sc.next());
		System.out.println("고객의 주소를 입력하세요.");
		add.add(sc.next());
		System.out.println("고객의 연락처를 입력하세요.");
		tel.add(sc.next());
	}
}
