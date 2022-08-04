package ex03.radomClass;

import java.util.Random;

public class MaintEntry {
	public static void main(String[] args) {
		Random rand = new Random(); // 객체 생성, 메모리 할당, 생성자 함수 자동호출
		System.out.println(rand.nextInt());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextBoolean());
		
		System.out.println(rand.nextInt(5)); // 0 < x < 5 사이의 수를 내림해서 정수로 출력 : 0 ~ 4 출력
		System.out.println(rand.nextInt(10) + 1); // 1 ~ 10
		
		for (int i = 0; i < 11; i++) {
			System.out.print(rand.nextInt(10) + 1 + " ");
		}
	}
	
}
