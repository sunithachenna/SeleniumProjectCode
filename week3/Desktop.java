package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("My Desktop size is 11 inches");
	}

	public static void main(String[] args) {
		Desktop pc = new Desktop();
		pc.computerModel();
		pc.desktopSize();

	}

}
