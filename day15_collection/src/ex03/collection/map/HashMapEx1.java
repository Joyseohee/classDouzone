package ex03.collection.map;

import java.util.HashMap;
import java.util.Scanner;

// map : key - value 1 SET, combination of set and list.
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("kosa", "1234");
		map.put("KBS", "1111");
		map.put("KBS", "1234");	// 중복 불허, 마지막거로 저장
//		System.out.println(map);
//		System.out.println(map.size());
		
		Scanner sc= new Scanner(System.in);
		//*
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id :");
			String id = sc.nextLine().trim();
			System.out.println("pwd :");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
		//*/
	}
	
}
