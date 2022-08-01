package ex05.For;

public class ForTest {
	public static void main(String[] args) {
		int a = 1, b = 1;

		// 초기값과 증감식은 2개 이상 쓸 수 있다(단, 조건식은 무조건 1개만)
//		for(a = 1, b = 1; a <= 10; a++, b += 2) {
//			System.out.println(b);
////			System.out.println(a);
//		}

		// infinite loop
		for (a = 1, b = 3;; a++, b += 2) {
			System.out.println(b);
			if (a < 6) 
				break; // break는 가장 가까운 곳을 빠져나
		}
		System.out.println("*****\n\n");

		// 초깃값과 증감식은 생략 가능(조건문은 생략하면 무한 루프에 빠짐)
		for (; a <= 10;) {
			System.out.println(b);
			a++;
			b += 2;
		}

	}

}
