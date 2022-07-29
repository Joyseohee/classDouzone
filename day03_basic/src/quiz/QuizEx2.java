/*
 * 1. 월급을 단위로 계산하기
 * 2. int su = 12345;를 '시 : 분 : 초'로 표기
 */

package quiz;

public class QuizEx2 {
	
	public static void main(String[] args) {
		int wage = 1234567;
		
		int measure = 10000;
		
		while(wage > 0) {
			System.out.println(measure +  "원 : " + (int)(wage/measure));
			wage = wage % measure;
			measure /= 10;
		}
	}

}


