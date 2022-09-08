package ex01.collection.set;

import java.util.Set;
import java.util.TreeSet;

// 로또 만들기
public class TreeSetEx2 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1; // 0~n-1 
			set.add(num);
		}
		System.out.println(set);
	}

}
