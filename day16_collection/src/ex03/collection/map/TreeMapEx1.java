package ex03.collection.map;
import java.util.*;


class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		// tree는 자동 정렬 기능이 있다.
		tm.put("z",1000);
		tm.put("b",1000);
		tm.put("c",1000);
		tm.put("d",1000);
		System.out.println("name : "+tm.get("aa"));
		System.out.println(tm);
		
		
		
	}
}
