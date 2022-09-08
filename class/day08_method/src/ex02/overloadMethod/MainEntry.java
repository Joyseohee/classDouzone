package ex02.overloadMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(plus(3, 5));
		System.out.println(plus(3, 5, 7));
		add("kosa", "good");
		add(1.678, 1.908);
		System.out.println(name("seohee", 10));
		System.out.println(name("seohee"));
	}
	
	public static int plus(int x, int y, int z) {	// 더할 수 갯수 늘 수록 parameter 늘려야한다.
		int hap = x + y + z;
		return hap;
	}
	
	public static int plus(int x, int y) {	// 더할 수 갯수 늘 수록 parameter 늘려야한다.
		int hap = x + y;
		return hap;
	}
	
	public static void add(String str1, String str2) {	// 더할 수 갯수 늘 수록 parameter 늘려야한다.
		System.out.println(str1 + str2);
	}
	
	public static void add(double str1, double str2) {	// 더할 수 갯수 늘 수록 parameter 늘려야한다.
		System.out.println(str1 + str2);
	}
	
	public static String name(String name, int x) {
		String str = name;
		for (int i = 0; i < x; i++) {
			str += x + "\n";
		}
		return str;
	}
	public static String name(String name) {
		String str = name;
		return str;
	}
}


