public class emailapp {

	public static void main(String[] args) {

		Email person = new Email("Sumanth", "SM");

		person.setAlternateMail("smsam@gmail.com");
		System.out.println("Alternate email is " + person.getAlternateMail());

		person.setMailBoxCapacity(100);
		System.out.println("Mail box capacity is :" + person.getMailBoxCapacity());

		person.setPassword("NJJSNNIS%@123");
		System.out.println("password is changed = " + person.getPassword());
	}

}
