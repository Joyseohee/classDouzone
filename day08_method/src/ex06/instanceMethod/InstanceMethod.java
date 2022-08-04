package ex06.instanceMethod;

class B {
	int x, y;

	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B();	// 객체 생성, heap 메모리에 할당, 생성자함수 자동 호출
		b.setData(3, 7);
	}

}
