package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class q1427Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받아 char로 저장하는 리스트
		ArrayList<Character> N = new ArrayList<Character>(); 
		
		// 입력받기
		String n = br.readLine();
		
		// 입력받은 글자 길이만큼 for문을 돌며 ArrayList로 저장
		for (int i = 0; i < n.length(); i++) {
			N.add(n.charAt(i));
		}
		
		// 오름차순 정렬하는 함수를 사용하고 안에 내림차순 정렬하는 함수 사용
		N.sort(Collections.reverseOrder());
		
		// 출력
		for (int i = 0; i < N.size(); i++) {
			System.out.print(N.get(i));
		}
		br.close();
	}
}
