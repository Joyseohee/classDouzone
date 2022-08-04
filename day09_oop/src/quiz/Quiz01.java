package quiz;

import java.util.Random;
import java.util.Scanner;

// 업 다운 게임 프로그램 작성(난수 이용)

public class Quiz01 {
	public static void main(String[] args) {
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
				
		// 정답 추출
		int ans= (int)(r.nextInt(100) + 1 );
		
		// 입력 받기
		int[] input = new int[5]; 
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력해 주세요.");
			input[i] = sc.nextInt();
			
			// 맞았을 경우
			if(input[i] == ans) {
				System.out.println("맞췄습니다!"); return;
			}
			
			// 틀렸을 경우
			else {
				System.out.print("틀렸습니다. ");		// 틀리고 다시 시도
				if(input[i] < ans) System.out.print("더 큰 수를 입력하세요. ");	// up
				else System.out.print("더 작은 수를 입력하세요. ");	// down
				if(i == 4) System.out.println("주어진 기회를 소진하셨습니다. 정답은 " + ans + "입니다.");		// 틀리고 끝 
			}
		}
	}
}