package numberFinder;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,6,7,8};
		int wantedNumber = 7;
		String message = "Your number is not in my array";
		
		for(int i = 1;i < numbers.length; i++) 
		{
			if (wantedNumber == numbers[i]) 
			{
				message = "Hey, I found your number";
				break;
			}
		}
		System.out.println(message);

	}

}
