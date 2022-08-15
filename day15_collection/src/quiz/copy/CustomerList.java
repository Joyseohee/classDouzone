package quiz.copy;

import java.util.ArrayList;
import java.util.Scanner;

class CustomerList {
	// class member var
	protected Scanner sc = new Scanner(System.in);
	protected ArrayList<String> name = new ArrayList();
	protected ArrayList<String> add = new ArrayList();
	protected ArrayList<String> tel = new ArrayList();
	protected String cname = null;
	protected char ans2;
	protected int i;


	// constructor method
	public CustomerList() {
		name.add("이름");
		add.add("주소");
		tel.add("연락처");
	}
	
	//getter/setter method
	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

	public ArrayList<String> getAdd() {
		return add;
	}

	public void setAdd(ArrayList<String> add) {
		this.add = add;
	}

	public ArrayList<String> getTel() {
		return tel;
	}

	public void setTel(ArrayList<String> tel) {
		this.tel = tel;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public char getAns2() {
		return ans2;
	}

	public void setAns2(char ans2) {
		this.ans2 = ans2;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	// class member method
	public void setCustomer() {
		System.out.println("고객 정보를 수정하겠습니다.");
		System.out.println("정보를 수정할 고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println("이름을 수정하세요.");
		name.set(i, sc.next());
		System.out.println("주소를 수정하세요.");
		add.set(i, sc.next());
		System.out.println("연락처 수정하세요.");
		tel.set(i, sc.next());
		System.out.println("수정이 완료됐습니다.");
	}

	public void printList() {
		System.out.println("고객 정보 리스트를 출력합니다.");
		System.out.println("리스트를 출력할 고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println("이름 : " + name.get(i) + "\n주소 : " + add.get(i) + "\n전화번호 : " + tel.get(i));
	}

	public void delCustomer() {
		System.out.println("고객 정보를 삭제하겠습니다.");
		System.out.println("고객의 이름을 입력하세요.");
		cname = sc.next();
		i = name.indexOf(cname);
		System.out.println(cname + "고객의 정보를 정말로 삭제하시겠습니까? 이 작업은 되돌릴 수 없습니다. 답변은 y 혹은 n로 입력해주십시오.");
		ans2 = sc.next().charAt(0);
		if(ans2 == 'y') {
			name.remove(i);
			add.remove(i);
			tel.remove(i);
			System.out.println(cname + "님의 정보가 삭제됐습니다.");
		}
		System.out.println("이전 페이지로 돌아갑니다.");
	}

	public void addCustomer() {
		System.out.println("고객 정보를 추가하겠습니다.");
		System.out.println("고객의 이름을 입력하세요.");
		name.add(sc.next());
		System.out.println("고객의 주소를 입력하세요.");
		add.add(sc.next());
		System.out.println("고객의 연락처를 입력하세요.");
		tel.add(sc.next());
	}

}
