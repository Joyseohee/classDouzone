


/*
package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {1, 2, 3, 4, 5, 6};		// 나눠서 처리해야 함
//		int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}};		// 2행 3열 = {{},{}}로 나눠줘야 행렬 구분
		int[][] a = {{1, 2, 3}, {4, 5, 6}};			// 초기화로 행렬 구분
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("a[" + i +"][" + j + "] = " + a[i][j]);
			} // j end
		} // i end
		System.out.println("a.length = " + a.length);
	}

}
//*/





//*
package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {1, 2, 3, 4, 5, 6};		// 나눠서 처리해야 함
//		int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}};		// 2행 3열 = {{},{}}로 나눠줘야 행렬 구분
		int[][] a = {{1, 2, 3, 5, 6}, {4, 5, 6, 7, 8}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};			// 초기화로 행렬 구분
		
		
		// 2차원 배열 길이 구하는 함수	
		System.out.println("행 길이 : " + a.length);			// 기본은 행 길이
		System.out.println("열 길이 : " + a[1].length);		// 행 잡고 쓰면 열 길이
		System.out.println();
		
		// 2차원 배열 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println("a[" + i +"][" + j + "] = " + a[i][j]);
			} // j end
		} // i end
	}

}
//*/
