package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] arr = new char[test.length()];
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i=0;i<test.length();i++)
		{
			arr[i]= test.charAt(i);
			if (Character.isAlphabetic(arr[i]))
			{
				letter +=1;
			} else if (Character.isDigit(arr[i]))
			{
				num +=1;
			} else if (Character.isSpaceChar(arr[i]))
			{
				space +=1;
			} else 
			{ 
				specialChar +=1;
			}


		}
		System.out.println("No: of letters in the String : "+letter);
		System.out.println("No: of letters in the String : "+num);
		System.out.println("No: of letters in the String : "+space);
		System.out.println("No: of letters in the String : "+specialChar);
	}

}

