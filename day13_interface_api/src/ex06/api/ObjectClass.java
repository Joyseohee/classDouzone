package ex06.api;


class Point { }

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("hash code : " + pt.toString());
		System.out.println("hash code : " + pt);
		System.out.printf("10진수 %d\n", 0x5a1c0542);		// 숫자, 0숫자, 0x숫자
		System.out.println("==============================");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("hash code : " + pt2.toString());
		System.out.println("hash code : " + pt2);
//		System.out.printf("10진수 %d\n", 0x5a1c0542);		// 숫자, 0숫자, 0x숫자
		System.out.println("==============================");
		
		Point pt3 = new Point();					// new선언하면 메모리 새로 할당
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
		System.out.println(pt.hashCode() + ", " + pt3.hashCode());
		
		
		Point pt4;									// new 선언 안 하면 메모리 그대로 사용
		pt4 = pt;
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
		System.out.println(pt.hashCode() + ", " + pt4.hashCode());
	}
}
