package ex05.defaultCons;

// default constructor / API document
public class MainEntry {
	// a line ref
	/* several lines ref */
	/** document ref */
	/**
	 * 
	 * @param args 메인은 아무 값도 넘겨 받지 않습니다.
	 * @param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @param y 곱을 구하는 것에 두번째 정수형 변수
	 * @param gob 변수는 x와 y를 곱한 값을 저장하는 변수
	 */
	public static void main(String[] args) {
		int x, y, gob = 1;
		String message;
		char ch = 'A';
		
		x = 5;
		y = 10;
		message = "Douzone 3th 화이팅!!";
		gob = gob(x, y);
		
		System.out.println(ch);
		System.out.println(message);
		System.out.println(x + " * " + y + " = " + gob);
	}

	public static int gob(int x, int y) {
		return x * y;
	}

}
