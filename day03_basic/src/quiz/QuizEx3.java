package quiz;

public class QuizEx3 {

	public static void main(String[] args) {
		int su = 12345;
		
		int m = 60*60;
		
		while(su > 0) {
			System.out.print((int)(su / m));
			su = su % m;
			m /= 60;
		
			if(su > 0) {
				System.out.print(" : ");
			}
			
		}
		
	}
}
