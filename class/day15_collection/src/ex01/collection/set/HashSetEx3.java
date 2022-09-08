package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;


class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//*
	@Override
	public int hashCode() {
		return super.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			return super.equals(temp.name) && age == temp.age;
			
		}
		return false;
	}
	//*/
}

class A {
	
}
class B extends A {
	
}


public class HashSetEx3 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
//		Person ps = new Person("aaa", 55);
//		set.add(ps);
		
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		set.add(new Person("David", 30));
		
		System.out.println(set);
		
		
		/*
		A a = new A();
		B b = new B();
		
		A bb = new B();
		
		
		// 0 instanceof 1 : 0 < 1
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		//*/
		
	}

}
