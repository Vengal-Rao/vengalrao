package org.college;

public class Student extends College {
public void studentName() {
	// TODO Auto-generated method stub
System.out.println("Student Name: Vengal");
}
public void studentDept() {
	// TODO Auto-generated method stub
System.out.println("Student Dept: CSE");
}
public void studentId() {
	// TODO Auto-generated method stub
System.out.println("Student ID: 1234");
}
public static void main(String[] args) {
	Student s = new Student();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.studentName();
	s.studentDept();
	s.studentId();
	s.hostelName();
	s.deptName();
}
}
