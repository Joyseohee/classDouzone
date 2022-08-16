package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("호진", new Integer(90));
		map.put("민성", 100);
		map.put("보민", 80);
		map.put("지현", 65);
		map.put("서희", new Integer(75));
		
		Set set = map.entrySet(); // System.out.println(set);
		Iterator it = set.iterator(); // System.out.println(it.next());
//		Set set = (Set)map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	// 분리 가능해짐
			System.out.println("name = " + e.getKey() + ", score = " + e.getValue());
			
		}
		
		set = map.keySet();	// value값은 유일성이 없어서 중복되면 삭제되기 때문에 Key값만 뽑음
		System.out.println("list of participants : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {	// 다음 요소가 있는지 물음
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : " +  total);
		System.out.println("평균 : " +  (double)total/set.size());
		System.out.println("최고 점수 :" + Collections.max(values));
		System.out.println("최하 점수 :" + Collections.min(values));
	}
}

