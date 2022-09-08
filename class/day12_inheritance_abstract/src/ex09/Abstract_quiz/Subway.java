package ex09.Abstract_quiz;

import java.util.Scanner;

public class Subway extends Trans {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int ask() {
		System.out.println("어떤 교통수단을 이용하시겠습니까? 숫자를 입력해주세요. (1. 지하철 2. 버스 3. 자전거)");
		return sc.nextInt();
	}
	@Override
	public char ask2() {
		System.out.println("잠시 정차했습니다. 여행을 마치시겠습니까? y/n로 입력하세요.");
		return sc.next().charAt(0);
	}
	@Override
	public void start(String sub) {
		System.out.println(sub + "이/가 칙칙폭폭 출발했습니다.");

	}
	@Override
	public void stop(String sub) {
		System.out.println(sub + "이/가 끼이익 도착했습니다.");
	}

}
