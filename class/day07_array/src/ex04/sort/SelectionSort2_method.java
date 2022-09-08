package ex04.sort;

public class SelectionSort2_method {
	
	static void swap(int A, int B) {
		int tmp = A;
		A = B;
		B = tmp;
	}
	
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		
		// before sort
		System.out.print("int[] a = {");
		// print
		for (int i = 0; i < a.length; i++) {
			if(i == (a.length - 1)) System.out.print(a[i]); 
			else System.out.print(a[i] +",");
		}
		System.out.println("}");
		
		// after sort
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if(a[j] < a[i]) swap(a[j], a[i]);
			}
			System.out.print(a[i] + " ");
		}
	}
	
	

}

