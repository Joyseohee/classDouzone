package quiz;

public class ForeachTEst {
	public static void main(String[] args) {
		int sum = 0, num;
		for(num = 1 ; ; num++) {	// 무한루프
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println(sum);
		System.out.println(num);
		
		/*
		for (num = 1; num <= 100; num++ ) {
			if(num % 3 != 0) continue;	// 조건에 맞아야 뒤에 있는 실행구문이 실행된다. 아니면 }로 종결하고 다시 num++(조건식으로)
			System.out.println(num);
		}
		//*/
		
		/*
		for (sum : args) {
			
		}
		//*/
		
	}

}
