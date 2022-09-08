package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {
		char ch1 = 'A';		// ASCII
		char ch2 = 'Z';
		char ch3 = 'a';
		char ch4 = 'z';
		int i1 = ch1;
		int i2 = ch2;
		int i3 = ch3;
		int i4 = ch4;
		
		char ch5 = (char)(i3 - 32);

		int i5 = (int)'@';
		
		System.out.println(i1);
		System.out.println(i2); 
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(ch5);
		
		System.out.println();
		System.out.println("@" + ", ASCII code = " +i5);
		System.out.println(ch1 + ", ASCII code = " + (int)ch1);
		
		// 진법
		int num = 12;		// 10진수
		int xnum = 0xC;		// 16진수
		int onum = 014;		// 8진수
		int bnum = 0b1100;
		
		System.out.println();
//		System.out.printf("%o\n", bnum);		
		System.out.println(num);
		System.out.println(xnum);
		System.out.println(onum);
		System.out.println(bnum);
		
		System.out.println();
		System.out.println("변환1");
		System.out.printf("%d = %d = ", 0xc, 0XC);
		System.out.printf("%d = ", 014);
		System.out.printf("%d", 0b1100);
		
		System.out.println();
		System.out.println("변환2");
		System.out.printf("%x = %X = ", 12, 12);
		System.out.printf("%o = ", 12);
		System.out.printf("%B", 12);
		
		// 한 줄 삭제는 Ctrl + D
		
		
	}
}
