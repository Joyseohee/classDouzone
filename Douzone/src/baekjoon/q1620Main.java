package baekjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/* 입력 : 첫째 줄에는 도감 포켓몬의 개수 N, 맞춰야 하는 문제의 개수는 M
1<= N, M <= 100,000
N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력. 포켓몬의 이름은 모두 영어로만 이루어져있고, 첫 글자만 대문자, 나머지 문자는 소문자. 
일부 포켓몬은 마지막 문자만 대문자일 수도 있어. 2 <= 포켓몬 이름 길이 <= 20 
그 다음 줄부터 총 M개의 줄에 내가 맞춰야하는 문제가 입력.
문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야해. 
입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같고, 
입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어져. 그럼 화이팅!!!

* 출력 : 문제에 대한 답(m개 한 줄) 
입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 
문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력
 */


public class q1620Main {

	public static void main(String[] args) throws IOException {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		int M = sc.nextInt();
		
		String[] pname = new String[N];
		
		for (int i = 0; i < N; i++) {
			pname[i] = sc.next();
			System.out.println(pname[i]);
		}
		
		
	}

}

//instanceof String
