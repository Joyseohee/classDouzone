package quiz.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사칙연산자 입력받고 숫자 2개 입력받아서 사칙연산 프로그램 작성(io이용)

public class MainEntry {
	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			while (true) {
				System.out.println("수행하려는 사칙연산의 연산자를 입력하세요(예 : +, -, /, *");
				char op = br.readLine().charAt(0);
				System.out.println("연산하려는 숫자 2개를 차례로 입력해주세요.");
				int n1 = Integer.parseInt(br.readLine());
				int n2 = Integer.parseInt(br.readLine());
	
				switch (op) {
				case '+':
					System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
					break;
				case '-':
					System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
					break;
				case '*':
					System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
					break;
				case '/':
					System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
					break;
				default:
					System.out.println("입력이 잘못됐습니다. 다시 시도해주세요.");
					return;
				}
				System.out.println("계산기를 종료하시겠습니까? y/n");
				char ans = br.readLine().charAt(0);
				if(ans == 'y') break;
			}
		System.out.println("계산기를 종료합니다.");
		} catch(NumberFormatException e) {
			System.out.println("정수를 입력하세요.");
		} catch(IOException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
