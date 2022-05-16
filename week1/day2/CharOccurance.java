package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for (int i=0; i<length;i++)
		{
			if (charArray[i]=='c')
				count=count+1;
		}
		System.out.println(" the character occured " +count+" times");
	}

}

