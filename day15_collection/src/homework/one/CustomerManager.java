package homework.one;


import java.util.*;

public class CustomerManager extends Customer {
	Scanner sc = new Scanner(System.in);
	ArrayList name1 = new ArrayList();
	ArrayList address1 = new ArrayList();
	ArrayList tel1 = new ArrayList();

	public void CustomerAdd() {
		System.out.println("name : ");		setName(sc.next());
		System.out.println("address : ");		setAddress(sc.next());
		System.out.println("phone number : ");		setTel(sc.next());
		name1.add(getName());
		address1.add(getAddress());
		tel1.add(getTel());
	} // customer m end

	public void CustomerDelete() {
		try {
//			System.out.println();
			System.out.println("삭제할 번호 입력하세요.(int)  : ");
			int a = sc.nextInt();
			name1.remove(a);
			address1.remove(a);
			tel1.remove(a);
		} catch (Exception e) {
			System.out.println("없는 번호 입니다.");
		} // try catch end
	} // customer m end

	public void CustomerUpdate() {
		try {
			System.out.println("수정할 번호 입력하세요(int) : ");
			int a = sc.nextInt();
			System.out.println("name  : ");
			name1.set(a, sc.next());
			System.out.println("address : ");
			address1.set(a, sc.next());
			System.out.println("phone number : ");
			tel1.set(a, sc.next());
		} catch (Exception e) {
			System.out.println("not index number.");
			e.printStackTrace();
		}
	} // update m end

	public void display() {
		System.out.println("Num"+"\tName"+"\tAddress"+"\tTel");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < name1.size(); i++) {
			System.out.println(i +"\t"+ name1.get(i) +"\t"+  address1.get(i) + "\t"+tel1.get(i));
		} // for x end
	} // display m end
} // class end
