package org.system;

public class Desktop extends ComputerModel {
	public void desktopScreenSize() {
		System.out.println("Scrren size is 15.6 inch");
	}
	public static void main(String[] args) {
		Desktop laptop = new Desktop();
		laptop.computerModel();
		laptop.computerProcessor();
		laptop.desktopScreenSize();
		
	}

}
