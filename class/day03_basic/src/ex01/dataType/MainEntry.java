package ex01.dataType;

public class MainEntry {
	
	static int su3;				// int = 0, double = 0.0. String = null
	static String str2;
	static double dd;
	

	public static void main(String[] args) {
		
		
		// static 변수는 자동 초기화
		System.out.println("su3 = " + su3);
		System.out.println("str2 = " + str2);
		System.out.println("dd = " + dd);
		
		
		// 지역변수는 반드시 초기화해야 출력 가능
		int su = 9;
		char ch = 'A';			// '문자'
		String str = "korea";	// "문자열"
		double d = 12.34;
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		
		System.out.println(su + ", " + ch + ", " + str + ", " + d);
		
		//
		int x = 2;				// 기본 자료형
		Integer y = 2; 			// 참조 자료형
		
		// Sting은 char로 변환 불가능
		// String str3 = 'A';
		String str4 = "A";
		
	}

}
