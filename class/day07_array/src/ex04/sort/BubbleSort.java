package ex04.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		int tmp;
		
		// before sort
		System.out.print("Before Bubble Sort : int[] a = {");
		// print
		for (int i = 0; i < a.length; i++) {
			if(i == (a.length - 1)) System.out.print(a[i]); 
			else System.out.print(a[i] +", ");
		}
		System.out.println("}");
		
		
//		System.out.print("After Bubble Sort : int[] a = {");
		// after sort
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if(a[j] > a[j + 1]) {		// 부등호 방향 따라 오름차순/내림차순
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
//			if(i == (a.length - 1)) System.out.print(a[i]);
			
		}
//		System.out.println("}");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	

}
