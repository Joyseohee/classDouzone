package quiz;


import java.util.Random;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] ans = new int[6];
		int[] put = new int[6];
		//*
		boolean[] check = new boolean[6];
		
		// 로또 값 넣기
		for (int i = 0; i < 6; i++) {
			ans[i] = (int)(ran.nextInt(45) + 1);
		}
		
		// 사용자가 값 고르기
		int c = 0;
		while(c < 6) {
			System.out.println("1에서 45 사이의 숫자를 입력해주세요.");
			int tmp = sc.nextInt();
			if (tmp >= 1 && tmp <= 45) {
				ans[c] = tmp;
				c++;
			}
			else System.out.println("입력이 잘못됐습니다.");
		}
		
		// 값과 비교하기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(ans[i] == ans[j]) check[i] = true;
				else check[i] = false;
			}
		}
		
		// 출력하기
		int count = 0;
		for (int i = 0; i < 6; i++) {
			if(check[i] == true) count ++;
		}
		if(count == 6) System.out.println("1등에 당첨됐습니다!");
//		else if(count == 5) System.out.println("2등에 당첨됐습니다!");
		else if(count == 5) System.out.println("3등에 당첨됐습니다!");
		else if(count == 4) System.out.println("4등에 당첨됐습니다!");
		else if(count == 3) System.out.println("5등에 당첨됐습니다!");
		else System.out.println("다음 기회를 노려보세요.");
		//*/
	}
	
}
