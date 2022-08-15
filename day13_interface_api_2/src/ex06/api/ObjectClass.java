package ex06.api;

class Point {   }

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());  // 1521118594
		System.out.println("Object String: "+ pt.toString()); // 5aaa6d82
		System.out.println("Object String: "+ pt );
		System.out.printf("10진수 %d\n", 0x5aaa6d82); // 숫자, 0숫자, 0x숫자
		System.out.println("====================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());  // 706277948
		System.out.println("Object String: "+ pt2.toString()); // 2a18f23c 
		System.out.println("Object String: "+ pt2 );
		System.out.println("====================================");
		
		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		
		if( pt.hashCode() == pt3.hashCode() ) {
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
		System.out.println(pt.hashCode() + ", " + pt3.hashCode());
		
//		Point pt4;
//		pt4 = pt;  // ?? 
		
		Point pt4 = new Point();
		pt4 = pt;  // 위의 것이나 이거나 마찬가지로 같죠. 
		System.out.println("=====================================");
		System.out.println(pt.hashCode() + ", " + pt4.hashCode());
		System.out.println("=====================================");
		if( pt.hashCode() == pt4.hashCode() ) {
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
		
			
		System.out.println(pt.hashCode() + ", " + pt4.hashCode());
		
		int a = 3, b = 5;
		System.out.println(a + ", " + b);
		a = b;
		System.out.println(a + ", " + b);
	}
}







