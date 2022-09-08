package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
	
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "4"};
		
		Set set = new HashSet();	//create an child object from parents object.
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		// objArr[0] != objArr[1]은 자료형이 다르기 때문 -> set print할 때 중복으로 인식하지 않는다. 
		System.out.println(set);
	}

}
