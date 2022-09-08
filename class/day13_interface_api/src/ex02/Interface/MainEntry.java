package ex02.Interface;

public class MainEntry {
	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		b.show();
		
		IDraw bb = new BB();
		bb.draw();
//		bb.show(); 	//부모꺼에는 없는 method라 IDraw로 객체 생성하면 안 나온다.
	}

}
