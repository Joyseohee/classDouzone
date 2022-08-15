package ex02.Interface;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println("Class BB overrides method of Interface IDraw");
		System.out.println(su);

	}
	
	public void show() {
//		su = 3000;	// static int which is made with the key word final can not be revise
		System.out.println(su);
	}

}
