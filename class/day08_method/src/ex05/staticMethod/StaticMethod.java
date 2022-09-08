package ex05.staticMethod;

class A {
	int x, y;

	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}

} // A class end

public class StaticMethod {
	public static void main(String[] args) {
		A obj = new A();	// 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
		obj.x = 9;
		System.out.println(obj.x);
		
		obj.setData(5, 7);
		
		A.setData(50, 70);
		
	}

}


//