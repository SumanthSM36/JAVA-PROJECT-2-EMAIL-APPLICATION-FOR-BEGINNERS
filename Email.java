import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	// private int defaultPasswordLength = 10;
	private int mailBoxCapacity;
	private String alternateMail;
	private String companyName = "@googlecompany.com";

	// create constructors
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED :" + this.firstName + this.lastName);

		// call a method asking for a method
		this.department = setDepartment();
		System.out.println("Department :" + this.department);

		// method to return random password
		this.password = randomPassword(10);
		System.out.println("Your password is : " + this.password);

		// create email Id
		String email = firstName.toLowerCase() + lastName.toLowerCase() + "." + companyName;
		System.out.println("Your email is " + email);
	}

	private String setDepartment() {
		System.out.println(
				"Department Codes\n1 Sales\n2 For Development\n3 For Accounting \n0 None\n Enter the Department:");
		Scanner scn = new Scanner(System.in);
		int depChoice = scn.nextInt();
		switch (depChoice) {
		case 1:
			return "sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		case 0:
			return "none";

		default:
			return "Sorry!!! Try Again";

		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@!#$%1234567890";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public String getAlternateMail() {
		return alternateMail;
	}

	public void setAlternateMail(String alternateMail) {
		this.alternateMail = alternateMail;
	}
}
