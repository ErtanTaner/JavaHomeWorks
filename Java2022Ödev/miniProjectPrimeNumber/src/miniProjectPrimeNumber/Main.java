package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		boolean isPrime = true;
		
		if (number < 2) 
		{
			isPrime = false;
		}
		
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0) 
			{
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) 
		{
			System.out.println("Your number is prime");
		}
		else 
		{
			System.out.println("Your nubmer is not prime");
		}
		

	}

}
