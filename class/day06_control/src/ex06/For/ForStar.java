package ex06.For;

public class ForStar {
	public static void main(String[] args) {

		// 삼각형
		for (int i = 0; i < 5; i++) { // row 개행

			for (int j = 0; j < i + 1; j++) { // col * 출
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 역삼각형1
		for (int i = 0; i < 5; i++) { // row 개행

			for (int j = 5; j > i; j--) { // col * 출
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 역삼각형2
		for (int i = 0; i < 5; i++) { // row 개행

			for (int j = 0; j < 5 - i; j++) { // col * 출
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 정사각
		for (int i = 0; i < 5; i++) { // row 개행

			for (int j = 0; j < 5; j++) { // col * 출
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
