package week3.day1;

public class Axis extends BankInfo {

	public void deposit() {
		System.out.println("This is deposit from Axis");
	}
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.deposit();
	}
}
