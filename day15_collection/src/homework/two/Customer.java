package homework.two;

public class Customer {
	//
	private String name;
	private String address;
	private String contact;
	private String rentedMovie;
	private String date;
	private String rentedYN;

	public Customer() {

	}

	public Customer(String name, String address, String contact) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		date = "today";
		rentedMovie = "N/A";
		rentedYN = "No";

	}

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRentedMovie() {
		return rentedMovie;
	}

	public void setRentedMovie(String rentedMovie) {
		this.rentedMovie = rentedMovie;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRentedYN() {
		return rentedYN;
	}

	public void setRentedYN(String rentedYN) {
		this.rentedYN = rentedYN;
	}

}
