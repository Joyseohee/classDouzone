package ex04.staticMember;

class Atm {
	int count;	// instance member
	static int total;	// static member
	
	public Atm(int amount) {	// constructor method
		count += amount;
		total += amount;
	}
	
	public static void view() {	// static method에서는 instance member를 사용할 수 없다.
		total += 100;
//		count += 100;	
	}
	
	public void display() {	// intstance method에서는 instance && static member 모두 사용 가능
		count += 200;
		total += 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total;	// static은 메모리 상에서 주소가 바뀌지 않아서 굳이 this가 필요 없다.
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display();
		System.out.println("----------------");
		Atm at2 = new Atm(1000);
		at.display();
		System.out.println("----------------");
		Atm at3 = new Atm(1000);
		at3.display();
		System.out.println("----------------");
		
		System.out.println(at.count);	// instance는 반드시 객체 생성하고 써야한다.
		System.out.println(at.total);	// static은 두 가지 방법 모두 가능하다.
		System.out.println(Atm.total);
		
		
	}
}
