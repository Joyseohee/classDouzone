package ex01.Interface;

interface A {
	int x = 9;  // interface - abstract method , final member 만 가질 수 있다
	static final int y = 7777 ;
	
	public void show(); // 
	public abstract void disp();
	public int plus(int x, int y) ;
}  // A end

interface B {
	void view();
} // B end

interface C {
	String name = "happy";
	public void draw();
} // C end

interface D extends B {  // interface 간에 상속에서도 extends 키워드
	void dview();
}  // D end

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 반가워요~~~");
	}
}  // Rect end

class Shape {
	
}

class Multi extends Shape implements B, C, A {
//class Multi implements B, C, A extends Shape  {  // error
//class Multi implements B, C, A {

	@Override
	public void show() {  // A
		System.out.println("show call");
		
	}

	@Override
	public void disp() {
		System.out.println("disp call");
		
	}

	@Override
	public int plus(int x, int y) {
		System.out.println("plus call");
		return x + y;
	}

	@Override
	public void draw() {   // C
		System.out.println("draw call");
		
	}

	@Override
	public void view() {  // B
		System.out.println("view call");
		
	}
	
}


public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();		r.draw();
		C rr = new Rect();		rr.draw();
		System.out.println("***************************************");
		Multi m = new Multi();
		m.view();
		A a = new Multi();  // 부모 인터페이스를 이용해서 자손클래스 객체 생성 가능
		
		
	}
}






