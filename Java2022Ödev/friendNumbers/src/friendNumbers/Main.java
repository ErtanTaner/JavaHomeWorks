package friendNumbers;

public class Main {

	public static void main(String[] args) {
		int number = 284;
		int number2 = 220;
		int result = 0;
		int result2 = 0;
		
		for (int i = 1; i < number; i++) 
		
		{
			if (number %i == 0) 
			{
				result +=i;
			}
		}
		
		for (int i = 1; i < number2; i++) 
		{
			if (number2 %i == 0) 
			{
				result2 +=i;
			}
		}
		if(result == number2 && result2 == number) 
		{
			System.out.println("Your numbers are friend");
		}
		else 
		{
			System.out.println("Your numbers are lonely.. sad.");
		}
	}

}
