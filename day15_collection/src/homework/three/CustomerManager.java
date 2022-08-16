package homework.three;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager extends Customer implements Manager {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Customer> list = new ArrayList<Customer>();

	@Override
	public void add() {
		// TODO Auto-generated method stub

		System.out.println("Insert name");
		setName(scanner.next());
		String name = getName();

		System.out.println("Insert contacts");
		setContact(scanner.next());
		String tel = getContact();

		System.out.println("Insert Address");
		setAddress(scanner.next());
		String address = getAddress();

		list.add(new Customer(name, address, tel));

	}

	public void CustomerTxt() {
		try {

			OutputStream os = new FileOutputStream("Customer.txt");

			byte[] buffer = new byte[1024 * 8];

			for (Customer c : list) {
				os.write((c.getName() + "\r\n").getBytes());
				os.write((c.getAddress() + "\r\n").getBytes());
				os.write((c.getContact() + "\r\n").getBytes());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void CustomerTxt () {
	//
	// }

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (list.size() == 0) {
			System.out.println("There is no data to delete");
		} else {
			try {
				System.out.println("Which number do you want to delete?");
				display();
				int choice = scanner.nextInt();
				list.remove(choice - 1);
			} catch (Exception e) {
				System.out.println("Insert wrong number");
			}
		}
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub

		if (list.size() == 0) {
			System.out.println("There is no data available");
		} else {
			System.out.println("Who do you want to edit?");
			display();
			int choice = scanner.nextInt();
			System.out.println("which data do you want to edit?");
			System.out.println("1. name, 2. address, 3. Telephone");
			int editchoice = scanner.nextInt();
			System.out.println("Enter new info respectively");
			switch (editchoice) {

			case 1:
				list.get(choice - 1).setName(scanner.next());
				break;

			case 2:
				list.get(choice - 1).setAddress(scanner.next());
				break;

			case 3:
				list.get(choice - 1).setContact(scanner.next());
				break;

			default:
				System.out.println("Out of option");

			}

			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		//
		int length = list.size();
		if (length == 0) {
			System.out.println("There is no data, please insert data ");
			add();
		} else {
			System.out.println("=============================================");
			System.out.println("No " + "\t" + "Name " + "\t" + "Address "
					+ "\t" + "Telephone " + "\t" + "RentedVideo");
			System.out.println("=============================================");
			for (int i = 0; i < length; i++) {
				System.out.println(i + 1 + "\t" + list.get(i).getName() + "\t"
						+ list.get(i).getAddress() + "\t\t"
						+ list.get(i).getContact() + "\t\t" + list.get(i).getRentedMovie());
			}
			System.out.println("=============================================");

		}
	}

}
