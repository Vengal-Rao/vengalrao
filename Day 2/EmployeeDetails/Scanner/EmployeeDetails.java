package Scanner;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Employee Id:");
	int id = s.nextInt();
	System.out.println("Employee Id is: "+id);
	
	System.out.println("Enter the Employee Name: ");
	String name = s.next();
	System.out.println("Employee Name is: "+name);
	
	System.out.println("Enter the Email: ");
	String mail = s.next();
	System.out.println("Employee mail is: "+mail);
	
	System.out.println("Enter the phone number: ");
	long phno = s.nextLong();
	System.out.println("Employee Phone number is: "+phno);
	
	System.out.println("Employee Salry is: ");
	float f = s.nextFloat();
	System.out.println("Employee Salary is "+f);
	
	System.out.println("Employee Gender is: ");
	String g = s.next();
	System.out.println("employee gender is: "+g);
	
	System.out.println("Employee City: ");
	String c = s.next();
	System.out.println("Employee City is: "+c);
 	s.close();
}
}
