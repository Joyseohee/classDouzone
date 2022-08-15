package ex09.Abstract_quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] t = new Trans[3];
		
		t[0] = new Subway();
		t[1] = new Bus();
		t[2] = new Bicycle();
		
		int ans = t[0].ask();
		
		switch(ans) {
		case 1:
			t[0].start("지하철");
			break;
		case 2:
			t[1].start("버스");
			break;
		case 3:
			t[2].start("자전거");
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.println("****");
		char ans2 = t[0].ask2();
		switch(ans2) {
		case 'y':
			if(ans == 1) {
				t[0].stop("지하철");
				break;
			} else if (ans == 2) {
				t[1].stop("버스");
				break;
			} else if (ans == 3) {
				t[2].stop("자전거");
				break;
			} else System.out.println("y/n을 입력해주세요.");
			break;
		case 'n':
			System.out.println("여행이 이어집니다.");
			break;
		}
		
	}
}
