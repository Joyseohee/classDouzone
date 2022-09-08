package ex04.arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		/*
		int x = 3, y = 5;
		
		int result = methodEx(x, y);
		System.out.println(result);
		//*/
		
		/*
		// return array or object : call various int or etc,,
		int[] arrResult = methodEx2();			// 배열 타입도 함수에서 가져올 수 있음
		
		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i] + " ");
		}
		System.out.println();
		
		for (int item : arrResult) {
			System.out.print(item + " ");
		}
		System.out.println();
		//*/
		
		// 2차원 배열 함수 만들기 - 더한 결과를 출력
		add(methodEx3());
		
		// 주소 값이 찍힘
		for(int[] item : methodEx3()) {	
			System.out.print(item + " ");
		}
		System.out.println();
		
		// for each로 2차원 배열 데이터 출력
		for(int[] item : methodEx3()) {			// 주소값 찍고
			for(int arrItem : item) {			// 주소값에 있는 int를 출력
				System.out.print(arrItem + " ");
			}//arrItem end
			System.out.println();
		}//item end
	}

	private static void add(int[][] darr) {
		int[][] arr = methodEx3();
		int sum = 0;
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}

	private static int[][] methodEx3() {
		int[][] arr = {{1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}};
		return arr;
	}

	private static int[] methodEx2() {			// 저장할 변수 타입에 맞게 return 타입 설정
		int[] arr = {1, 2, 3, 4, 5, 6, 7};		// Store in heap Memory
		return arr;
	}

	public static int methodEx(int x, int y) {
		return x + y;
	}
}

/*
int[][] arr = mothodEx3();
int sum = 0;
for (int i = 0; i <arr.length; i++) {
	for (int j = 0; j < arr[0].length; j++) {
		sum += arr[i][j];
	}
}
return sum;
//*/
