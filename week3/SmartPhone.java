package week3.day1;

public class SmartPhone extends Android {
	
	public void connectWhatsApp() {
		System.out.println("Connect WhatsApp");
	}
	public void takeVideo() {
		System.out.println("Take Video from SmartPhone");
	}

	public static void main(String[] args) {
		//object for child method
		//SmartPhone phone = new SmartPhone();  uncomment to use this
		/*
		 * phone.makeCall(); phone.sendMmsg(); phone.saveContact(); phone.takeVideo();
		 * phone.connectWhatsApp();
		 */
		
		//--------Activity2------------
		
		 //object for child method
		SmartPhone phone = new SmartPhone();
		//object for parent method
		Android ph = new Android();
		//to call the child
		phone.takeVideo();
		//to call the parent
		ph.takeVideo();
	}

}
