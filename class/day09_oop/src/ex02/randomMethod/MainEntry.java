package ex02.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println();
		
		// radom() : 난수 발생 0.0 ~ 1.0
		System.out.println(Math.random());		// 자동으로 초기화한다. 매번 다른 수가 랜덤으로 나옴
		// 0 ~ n - 1
		System.out.println(Math.random() * 5);		// 0 < x < 5 까지 수가 출력
		// 0 ~ n - 1
		System.out.println((Math.random() * 5) + 1);		// 1 < x < 6 까지 수가 출력
		System.out.println();
		
		// 로또 숫자 뽑기
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45) + 1 + " ");
		}
		
	}
}
