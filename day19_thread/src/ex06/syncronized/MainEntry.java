package ex06.syncronized;

class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	//deposit method
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금 금액" + amount);
	}
	//withdraw method
	public void withdraw(int amount, String name) {
		synchronized (name) {
			if((money - amount) > 0) {
				Thread.yield();
				
				money -= amount;
				System.out.println(name + " : 출금금액" + amount);
			} else {
				System.out.println(name + " : 잔액이 부족합니다.");
			}	// if end
		}
	}
	
	// remains
	public void getMoney() {
		System.out.println("\t\t잔액은 : " + money);
	}
	
}	// end Atm

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() {	// 쓰레드 구현부이므로 꼭 해줘야 함
		for (int i = 0; i < 2; i++) {
			try { sleep(50);} catch (Exception e) {e.printStackTrace();}
			if(flag) {
				obj.deposit(((int)Math.random() * 10 + 2)*100, getName());
			} else {
				obj.withdraw(((int)Math.random() * 10 + 2)*100, getName());
			}
			flag = true;
			obj.getMoney();
		}
	}	// end run()
	
}	//end UserAtm

public class MainEntry {	
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "park");
		UserAtm user2 = new UserAtm(at, "kim");
		UserAtm user3 = new UserAtm(at, "lee");
		
		user1.start();
		user2.start();
		user3.start();
	}
}

