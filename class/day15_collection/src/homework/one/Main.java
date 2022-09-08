package homework.one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "0";
		CustomerManager cm = new CustomerManager();
		System.out.println("������ ���� ���α׷� ����");

		while ( a != "9") {   // while ( a.equels("9")) {
			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.println("1. add  2. delete \n3. set(update) 4. print(get) \n9.exit ");
			// System.out.println("5. ���������Է� 6. ������������ 7. ������������ 8. ����������� 9. ����");
			// System.out.println("--------------------------------------------------------------------------------------");
			a = sc.next();
			switch (a) {
			case "1":
				cm.CustomerAdd();
				break;
			case "2":
				cm.CustomerDelete();
				break;
			case "3":
				cm.CustomerUpdate();
				break;
			case "4":
				cm.display();
				break;
			// case "5":vm.VideoAdd();break;
			// case "6":vm.VideoDelete();break;
			// case "7":vm.VideoUpdate();break;
			// case "8":vm.display();break;
			case "9":
				System.exit(0);
			}// switch case end
		} // while end
	} // main m end
} // class end
