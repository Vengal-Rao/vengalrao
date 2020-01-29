package org.scanner;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student Id: ");
		int id = s.nextInt();
		System.out.println("Student Id is: "+id);
		
		System.out.println("Enter the Student Name: ");
		String name = s.next();
		System.out.println("Student Name is: "+name);
		
		System.out.println("Enter the Student Email: ");
		String mail = s.next();
		System.out.println("Student E-mail is: "+mail);
		
		System.out.println("Enter the phone number: ");
		long phno = s.nextLong();
		System.out.println("Student Phone number is: "+phno);
		
		System.out.println("Enter the Student Gender: ");
		String g = s.next();
		System.out.println("Student Gender is: "+g);
		
		System.out.println("Enter the Student City: ");
		String c = s.next();
		System.out.println("Student City is: "+c);
	 	s.close();
	}

}
