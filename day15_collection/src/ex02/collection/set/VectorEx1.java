package ex02.collection.set;

import java.util.Iterator;
import java.util.Vector;

// List : 순서 있고, 중복 허용
public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length		/		capacity");
		System.out.println(v.size() + "		/		" + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4);
		v2.add(2);
		v2.add(new Integer(33));
		v2.add(2);
		System.out.println(v2.size() + "		/		" + v2.capacity());	// initial capacity, added capacity
		
		v2.add(20);
		v2.add(12);
		v2.add(50);
		System.out.println(v2.size() + "		/		" + v2.capacity());
		
		System.out.println("------iterator() method------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
			
		}
		System.out.println("\n------get() method------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + "\t");
		}
		System.out.println("\n------elementsAt() method------");
		for (int i = 0; i < v2.size(); i++) {	// Repeat for all elements in the vector
			Integer num = v2.elementAt(i);
			System.out.print(num.toString() + "\t");
			
		}
		
		System.out.println("\n\n" + v2.size() + "		/		" + v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size() + "		/		" + v2.capacity());
	}
}
