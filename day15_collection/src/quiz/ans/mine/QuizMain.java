package quiz.ans.mine;

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerList c = new CustomerList();
		int ans1;
		
		do {
			System.out.println("어떤 작업을 수행하시겠습니까? 1. 고객 정보 추가 2. 고객 정보 삭제 3. 고객 리스트 출력 4. 고객 정보 수정 5. 프로그램 종료");
			ans1 = sc.nextInt();
			switch (ans1) {
			case 1:
				c.addCustomer();
				break;
			case 2:
				c.delCustomer();
				break;
			case 3:
				c.printList();
				break;
			case 4:
				c.setCustomer();
				break;
			default:
				break;
			}
		} while (ans1 != 5);
		System.out.println("프로그램을 종료합니다.");
	}
}
