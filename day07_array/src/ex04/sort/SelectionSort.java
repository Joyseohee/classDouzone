package ex04.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		int tmp;
		
		// before sort
		System.out.print("Before Sort : int[] a = {");
		// print
		for (int i = 0; i < a.length; i++) {
			if(i == (a.length - 1)) System.out.print(a[i]); 
			else System.out.print(a[i] +", ");
		}
		System.out.println("}");
		
		
		System.out.print("After Sort : int[] a = {");
		// after sort
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if(a[j] > a[i]) {		// 부등호 방향 따라 오름차순/내림차순
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
//				System.out.print(a[i] + " ");
			}
			if(i == (a.length - 1)) System.out.print(a[i]);
			else System.out.print(a[i] + ", ");
		}
		System.out.println("}");
	}
	
	

}


/*
static void swap(int A, int B) {
	int tmp = A;
	A = B;
	B = tmp;
}
//*/


/*
int[] a = {7, 3, 5, 2, 8};
		
		System.out.print("int[] a = {");
		// print
		for (int i = 0; i < a.length; i++) {
			if(i == (a.length - 1)) System.out.print(a[i]); 
			else System.out.print(a[i] +",");
		}
		System.out.println("}");
		// sum
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum = " + sum);
		
//*/