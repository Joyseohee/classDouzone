package ex09.break_Continue;

public class Multibreak {
	public static void main(String[] args) {

		boolean flag = true;

		first: {
			second: {
				third: {
					int k = 100;
					System.out.println("before the break");
					if (flag)
						break second;
					System.out.println("this wont execute");
				}//end third
			System.out.println("우리반");
			}//end second
		System.out.println("This is after second block");
		}//end first
		
//		
//		
//		
//		for (int i = 0; i < args.length; i++) {
//			for (int j = 0; j < args.length; j++) {
//				for (int j2 = 0; j2 < args.length; j2++) {
//					
//				}
//			}
//		}
	}

}
