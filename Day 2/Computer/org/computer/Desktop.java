package org.computer;

public class Desktop extends Computer{
public void desktopSize() {
	// TODO Auto-generated method stub
System.out.println("Size: 32 inch");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
}
}
