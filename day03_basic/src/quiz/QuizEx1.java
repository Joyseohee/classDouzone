package quiz;

// %, /
public class QuizEx1 {
	public static void main(String[] args) {
		// 1. 변수 선언
		int pay = 567891;
		int man, chun, back, sip;			// 몫 저장 변수 선언
		int m_na, ch_na, b_na;	// 나머지 저장 변수 선언
				
		// 2. 메시지 출력 및 입력 받기
		// 3. 처리(계산)
		
		man = pay / 10000;
		m_na = pay % 10000;
		
		chun = m_na / 1000;
		ch_na = m_na % 1000;
		
		back = ch_na / 100;
		b_na = ch_na % 100;
		
		sip = b_na / 10;
		
				
		
		int pay8 = (pay / 10000);
		int pay12 = (pay % 10000 / 1000);
		int pay13 = (pay % 1000 / 100);
		int pay14 = (pay % 100 / 10);
		
		
		// 4. 결과 출력
		System.out.println("\n\n만원 : " + man 
							+ "장\n천원 : " + chun 
							+ "장\n백원 : " + back 
							+ "장\n십원 : " + sip + "장\n");
		
		System.out.println("\n\n만원 : " + (pay / 10000) 
				+ "장\n천원 : " + (pay % 10000) / 1000 
				+ "장\n백원 : " + ((pay % 10000) % 1000) / 100 
				+ "장\n십원 : " + (((pay % 10000) % 1000) % 100) / 10  + "장\n");
		
		System.out.println();
		System.out.println("만원 : " + pay8);
		System.out.println("천원 : " + pay12);
		System.out.println("백원 : " + pay13);
		System.out.println("십원 : " + pay14);
		
		
		System.out.println("***************************");
//		int pay = 567891;
		int money = 10000;
		
		while(pay > 0) {
			System.out.println(money + "원 : " + (int)pay/money);
			pay = pay % money;
			money = money / 10;
		}
		
		
		
//		int pay9 = ((pay / 1000) - (pay / 10000) * 10 );	
//		int pay10 = ((pay / 100) - (pay / 1000) * 10 );
//		int pay11 = ((pay / 10) - (pay / 100) * 10 );

		
		
		
		
		
//		int pay1 = pay % 10;
//		int pay2 = (pay / 100000) % 10;
//		int pay3 = (pay / 10000) % 10;
//		int pay4 = (pay / 10000) % 10;
//		int pay5 = (pay / 1000) % 10;
//		int pay6 = (pay / 100) % 10;
//		int pay7 = (pay / 10) % 10;
//		
		
		
//		System.out.println(pay1);
//		System.out.println(pay2);
//		System.out.println(pay3);
//		System.out.println(pay4);
//		System.out.println(pay5);
//		System.out.println(pay6);
//		System.out.println(pay7);
		
	}
}
