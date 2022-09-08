package ex03.argumentVariable;

public class MainEntry {
	public static void main(String[] args) {
		
		// 
		plus(1, 2, 3);
		plus(1, 2, 3, 4, 5);
		
		// automatically
		plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	// automatically created
		plus("a ", "kbs ", "mbc ", "sbs");
		
	}
	
	public static void plus(int ... x) {		// 가변길이배열
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	public static void plus(String ... x) {		// 가변길이배열
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}


}

/*
	private static void plus(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
		
	}


	public static void plus(int x, int y, int z) {
		int hap = x + y + z;
		System.out.println(hap);
	}
	
	public static void plus(int x, int y, int z, int a, int b) {	// 하나하나 늘리기 힘들다.
		int hap = x + y + z + a + b;
		System.out.println(hap);
	} 
//*/
 