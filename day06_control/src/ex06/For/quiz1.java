package ex06.For;

// 구구단 전체 출력하는 프로그램 작성

public class quiz1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			} // end j : finish the row
		System.out.println();
		}// end i : finish the column
	}
}
