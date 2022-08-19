package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = { "abc", "kbs", "dirotor" };
		t1.set(str);		t1.print();
		System.out.println("===================");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num);		t2.print();
		System.out.println("===================");
		
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] su = {12.45, 2.02, 323.5, 47.2, 5.5, 6.3, 77.7};
		t3.set(su);		t3.print();
		System.out.println("===================");
		
		GenericEx<Object> t4 = new GenericEx<Object>();
		Object[] obj = {"12.45", 2, 323.5, 47.2, 5.5,"text", 77.7};
		t4.set(obj);		t4.print();

	}
}
