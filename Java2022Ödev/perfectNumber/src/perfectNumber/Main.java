package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int result = 0;

		for (int i = 1 ; i < number; i++) 
		{
			if (number  % i == 0) 
			{
				result +=i ;
			}
		}
		if (result == number) 
		{
			System.out.println("Your number is perfect");
		}
		else 
		{
			System.out.println("Your number is not perfect");
		}
		

		
		
	}

}
