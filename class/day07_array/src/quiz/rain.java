package quiz;

import java.util.Scanner;

public class rain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달은 며칠이 지났습니까?");
		int n = sc.nextInt();

		double[] amount = new double[n];
		double total = 0;
		double avg = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + "일 강수량을 입력하세요.");
			amount[i] = sc.nextDouble();
			total += amount[i];
			avg = total/n;
		}
		
		System.out.printf("이번 달의 평균 강수량은 %.2f mm 입니다.", avg);
	}
}
