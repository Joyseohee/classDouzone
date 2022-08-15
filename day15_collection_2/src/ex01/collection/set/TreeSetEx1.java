package ex01.collection.set;

import java.util.TreeSet;

//Set : 순서 없고, 중복 허용 X
public class TreeSetEx1 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		int[] score = { 85, 95, 35, 45, 65, 10, 100 };
		
		for (int i = 0; i < score.length; i++) {
			
			set.add(new Integer(score[i]));
			
		}
		
		System.out.println(set);  // 자동 정렬한다.
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		System.out.println(set.first());
		System.out.println(set.last());
	}
}
