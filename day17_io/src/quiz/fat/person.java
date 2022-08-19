package quiz.fat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
 * 
 */

public class person {
	protected String Name;
	protected String Gender;
	protected int Weight;
	protected int Tall;
	protected double BMI;
	protected String Con;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public person() {
		super();
	}

	public person(String name) throws IOException {
		super();
		Name = name;
		System.out.println("성별을 입력하세요 (여성 : f, 남성 : m)");
		Gender = br.readLine();
		System.out.println("몸무게를 입력하세요.");
		Weight = Integer.parseInt(br.readLine());
		System.out.println("키를 입력하세요.");
		Tall = Integer.parseInt(br.readLine());
		if(Gender.equalsIgnoreCase("f")) {
			BMI = (Tall - 100) * 0.85;
		} else if(Gender.equalsIgnoreCase("m")) {
			BMI = (Tall - 100) * 0.9;
		} else {
			System.out.println("f나 m만 입력하세요.");
		}
		
	}
	
//	public 
	
}
