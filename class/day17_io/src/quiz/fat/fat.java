package quiz.fat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


/* 문제] 비만도 측정 프로그램 작성 - collection, file, io 이용
 * 추가/삭제/출력/수정 처리
 * 
 * 몸무게, 키를 입력 받아서 BMI 계산
 * 남: (키 - 100) * 0.9
 * 여: (키 - 100) * 0.85
 * 
 * 판정 > 
 * 18.5 미만 저체중
 * 18.5 ~ 22.9 정상
 * 23.0 ~ 23.9 과체중
 * 25.0 이상 비만
 */

public class fat extends person {
	static HashMap<String, person> map = new HashMap<String, person>();
	static int top = 0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 추가
	public static void add() throws NumberFormatException, IOException {
		System.out.println("이름을 입력하세요.");
		String Name = br.readLine();
		map.put(Name, new person(Name));
		top++;	// 사람 수 처리 변수
	}
	
	// 삭제
	public static void del() throws IOException {
		System.out.println("어떤 사람의 데이터를 삭제하시겠습니까?");
		String Name = br.readLine();
		if(map.containsKey(Name)) {
			map.remove(Name);
			System.out.println("삭제됐습니다.");
			top--;
		} else {
			System.out.println("이름을 잘못 입력하셨습니다. 해당 정보가 없습니다.");
		}
	}
	
	// 출력
	public static void print() {
		System.out.println("보유하고 있는 데이터 수 : " + top);
		System.out.println("이름 ---- 비만도 ---- BMI ---- 키 ---- 몸무게");
	}
	
	// 수정
	public static void edit() {
		
	}
	
}
