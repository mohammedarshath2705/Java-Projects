package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName; 
	 private String password;
	 private String department;
	 private int defaultPasswordLength=10;
	 private String email;
	 private int mailboxCapacity=500;
	 private String alternateEmail;
	 private String companysuffix = "babayaga.com";
	

	 
	 public Email(String firstName,String lastName) {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
		 
		 this.department=setDepartment();
		 System.out.println("Department :" +this.department);
		 
		 this.password=randomPassword(defaultPasswordLength);
		 System.out.println("Your password is : " +this.password);
		 
		 email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companysuffix; 
		 System.out.println("your email is :" +email);
	 }
	 private String setDepartment() {
		 System.out.println("New worker : " + firstName + ".Department Codes:\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code:");
		 Scanner sc = new Scanner(System.in);
		 int depChoice = sc.nextInt();
		 if(depChoice==1) {
			 return "Sales";
		 }
		 else if(depChoice==2) {
			 return "dev";
		 }
		 else if(depChoice==3) {
			 return "Acct";
		 }
		 else {
			 return "";
		 }
	 }
	 private String randomPassword(int length) {
		 String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		 char[] password = new char[length];
		 for(int i=0;i<length;i++) {
			 int rand = (int) (Math.random() * passwordset.length());
			 password[i]=passwordset.charAt(rand);
			// System.out.println(rand);
			 //System.out.println(passwordset.charAt(rand));
			 
		 }
		 return new String(password);
	 }
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity=capacity;
	 }
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail=altEmail;
	 }
	 public void changePassword(String password) {
		 this.password=password;
	 }
	 
	 public int setMailboxCapacity() {
		 return mailboxCapacity;
	 }
	 public String getAlternateEmail() {
		 return alternateEmail;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public String Showinfo() {
		 return "DISPLAY NAME : " + firstName + " " + lastName + " " +
				 "\nCOMPANY NAME : " + email + " " +
				 "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
			 
	 }
}
