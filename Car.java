package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("Method to apply break is done successfully");
	}
	public void applyGear() {
		System.out.println("Method to apply gear is done successfully");
	}
	public void switchOnAc() {
		System.out.println("Switching on the AC is done successfully");
	}
	public void applyAcclerate() {
		System.out.println("Acclerating the Car is done successfully");
	}
	public static void main(String[] args) {
		Car driveCar = new Car();
		driveCar.applyBreak();
		driveCar.applyGear();
		driveCar.switchOnAc();
		driveCar.applyAcclerate();
	}
}
