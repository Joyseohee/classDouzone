package ex01.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println(s1.concat(s2));  // 문자열 결합
		System.out.println(s1 + s2);
		System.out.println(s2.replace("EO", "korea"));  // SkoreaUL
		System.out.println("s1 = "+s1 +", s2 = "+s2);
//		s2 = s2.replace("EO", "korea");
		
		String s3 = new String("     ab     cd     ");
		System.out.println(s3);
		System.out.println("length = " + s3.length()); // 19  문자열길이
		s3 = s3.trim();  //  공백제거
		System.out.println("length = " + s3.length()); // 9
		System.out.println(s3);
		
		int[] arr = { 1,2,3,4,5 };
		for (int i = 0; i < arr.length; i++) {
			
		}
		
//		String s4 = new String("abc defgh k2344 keijk 439583958");
		String s4 = new String("abc/defgh/k2344/keijk/439583958");
//		String[] s5 = s4.split(" ");
		String[] s5 = s4.split("/");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		
		String s6 = "123-4567-8965";
		s5 = s6.split("-");
		for (int i = 0; i < s5.length; i++) {
			System.out.println( s5[i]);
		}
		
		String s8 = "1234567890abcdef     345566    77f88f8    string";
		char ch = s8.charAt(15);   //
		System.out.println(ch);
		System.out.println(s8.indexOf('f')); // 15
		System.out.println(s8.lastIndexOf('f')); // 36
		
//		System.out.println(s1);
//		System.out.println(s1.substring(3));
		
//		s8 = s1.substring(3);
		System.out.println(s1.substring(3));  // 3번 인덱스부터 끝까지 출력
		
//		s8 = s8.substring(5, 7); // 시작값 포함, 끝값 미포함 
		System.out.println(s1.substring(5, 7)); //
		System.out.println("\n=============================");
//		
//		 s8 = "1234567890abcdef     345566    77d888    string";
//		 System.out.println(s8.indexOf('d'));  // 13
//		 System.out.println(s8.lastIndexOf('d'));  // 33
//		 System.out.println("\n=============================");
//		 
		 System.out.println("소문자 출력 toLowerCass() : " + s2.toLowerCase());
		 System.out.println("대문자 출력 toUpperCass() : " + s1.toUpperCase());
//		 System.out.println(s2);  // ??
//		 System.out.println("\n=============================");
//		 
//		 System.out.println(s1.length()); // 문자열 길이
//		 char[] ch2 = s1.toCharArray();  
//		 
//		 for(int i=0; i < s1.length(); i++ ) {
//			 System.out.print(ch2[i] + "\t");
//		 }
//		 System.out.println();
		
		
//		System.out.println("s1 = "+s1 +", s2 = "+s2);
		
	}
}








