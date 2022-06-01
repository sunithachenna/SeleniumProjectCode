package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool  {
	// implementing from language interface
	public void Java() {
		System.out.println("This is Java Method");
	}
	//implementing from Testtool interface
	public void Selenium() {
	System.out.println("This is Selenium Method");
	}
	// methods from abstract class
	public  void python() {
		System.out.println("This is Python Method");
	}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	} 
}


