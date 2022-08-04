package quiz;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 3)
				break;
			System.out.println(arr[i] + " ");
		}
		System.out.println("============");

		//for(자료형 변수명 : 컬렉션 or 배열명) { }
		for (int item : arr) {
			System.out.println(item + " ");
		}
		System.out.println("============");

		
		int[] score = {78, 70, 88, 99, 58};
		int hap = 0;
		for(int item : score) {
			hap += item;
		}
		System.out.println("점수 합계 : " + hap);
	}

}
