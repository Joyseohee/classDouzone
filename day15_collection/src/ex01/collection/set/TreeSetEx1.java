package ex01.collection.set;

import java.util.TreeSet;

// Set: 순서 X, 중복X
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85, 95, 35, 45, 65, 76};
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println(set);	// automatically sort(ascending order)
		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: " + set.tailSet(50));
		System.out.println("제일 작은 값: " + set.first());
		System.out.println("제일 큰 값: " + set.last());
	}
	
}
