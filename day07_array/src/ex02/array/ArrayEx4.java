package ex02.array;

public class ArrayEx4 {
	public static void main(String[] args) {
		// 1.
		
		int[][] a1 = new int[2][3];
		a1[0][0] = 1;
		a1[0][1] = 2;
		a1[0][2] = 3;
		a1[1][0] = 4;
		a1[1][1] = 5;
		a1[1][2] = 6;
		
		// 2.
		
		int[][] a2 = new int[][] {{1,2,3}, {4,5,6}};
		
		// 3.
		int[][] a3 = {{1,2,3}, {4,5,6}};
		
		// pring
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);
		System.out.println("size of array`s column : " + a3.length);
		System.out.println("size of array`s row : " + a3[0].length);
		System.out.println("size of array`s row : " + a3[1].length);
		
		
		System.out.println("=====================");
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3[i].length; j++) {
				System.out.print(a3[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
