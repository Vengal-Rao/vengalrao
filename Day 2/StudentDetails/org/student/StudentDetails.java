package org.student;

import java.util.Scanner;

public class StudentDetails {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the student Id: ");
	int id = s.nextInt();
	System.out.println("Student Id is "+id);
	
	System.out.println("Enter the Student Name: ");
	String name = s.next();
	System.out.println("Student Name is: "+name);
	
	System.out.println("Mark 1 is: ");
	int m1 = s.nextInt();
	System.out.println("Mark 1 is: "+m1);
	
	System.out.println("Mark 2 is: ");
	int m2 = s.nextInt();
	System.out.println("Mark 2 is: "+m2);
	
	System.out.println("Mark 3 is: ");
	int m3 = s.nextInt();
	System.out.println("Mark 3 is: "+m3);
	
	System.out.println("Mark 4 is: ");
	int m4 = s.nextInt();
	System.out.println("Mark 4 is: "+m4);
	
	System.out.println("Mark 5 is: ");
	int m5 = s.nextInt();
	System.out.println("Mark 5 is: "+m5);
	
	int t = m1+m2+m3+m4+m5;
	
	System.out.println("Total is:"+t);
	
	float avg = t/5;
	System.out.println("Average is: "+avg);
	s.close();
}
}
