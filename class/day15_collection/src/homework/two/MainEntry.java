package homework.two;

import java.util.Scanner;

public class MainEntry {
	//
	public static void main(String[] args) {
		//
		CustomerManager cm = new CustomerManager();
		Scanner scanner = new Scanner(System.in);

		String choice = null;

		while (true) {
			System.out.println("\t\t" + "Customer Manager");
			System.out.println("========================================================");
			System.out.println("1. To add, 2. To edit, 3. To Remove, 4. To view, 5. Exit");
			choice = scanner.next();
			switch (choice) {

			case "1" :
				cm.add();
				cm.CustomerTxt();
				break;

			case "2":
				cm.edit(); 
				break;

			case "3":
				cm.remove();
				break;

			case "4":
				cm.display();
				break;

			case "5" :
				System.out.println("Good Bye");
				System.exit(0);
			default :
				System.out.println("Wrong Number");
				break;

			}

		}

	}
}
