package week1.day1;

public class TwoWheeler {

	//Declaring and Initializing the variables
	int noOfWheels = 2;
	short noOfMirrors =2;
	long chassisNumber = 390573209570L;
	boolean isPunctured = false;
	String bikeName = "Wego";
	double runningKM = 15000;
	public static void main(String[] args) {
		// creating a method named "myBike"
		TwoWheeler myBike = new TwoWheeler();
		System.out.println("No:of Wheels = "+myBike.noOfMirrors);
		System.out.println("No of Mirrors ="+myBike.noOfMirrors);
		System.out.println("Chassis Number = "+myBike.chassisNumber);
		System.out.println("Is your bike punctured? = "+myBike.isPunctured);
		System.out.println("No of Kilometers ="+myBike.runningKM);

	}

}
