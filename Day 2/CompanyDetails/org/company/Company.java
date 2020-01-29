package org.company;

public class Company extends Client{
public void companyName() {
	// TODO Auto-generated method stub
System.out.println("Company Name is Greens");
}
public static void main(String[] args) {
	Company c = new Company();
	c.companyName();
	c.clientName();
}
}
