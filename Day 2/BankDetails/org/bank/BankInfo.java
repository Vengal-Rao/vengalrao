package org.bank;

public class BankInfo extends AxisBank {
public void saving() {
	// TODO Auto-generated method stub
System.out.println("Savings amount: 20000");
}
public void fixed() {
	// TODO Auto-generated method stub
System.out.println("Fixed amount is: 2 lakhs");
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.saving();
	b.fixed();
	b.deposit();
}
}
