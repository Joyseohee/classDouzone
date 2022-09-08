package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서 X, 중복 X
public class HashSetEx1 {
	public static void main(String[] args) {
		// input set
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		// @output with Iterator
		System.out.println("요소 수 : " + hs. size());
		Iterator it = hs.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		
		// input only Class type
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(200);
		hs2.add(3);
		hs2.add(10000);
		
		System.out.println("-----------------");
		// output with for-loop
		for(Integer item : hs2) {
			System.out.println(item);
		}
		System.out.println("-----------------");
		for(Object item : hs2) {
			System.out.println(item);
		}	// 자료형 모를 때 Object로 지정
		
		System.out.println("-----------------");
		it = hs2.iterator();
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Iterator iterator = hs2.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			return;
		}
		
		
	}
}
