package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 266;
		int number2 = 25;
		int number3 = 26;
		int greatestNumber = number1;
		
		if (greatestNumber < number2) 
		{
			greatestNumber = number2;
		} 
		if (greatestNumber < number3) 
		{
			greatestNumber = number3;
		}
		
		System.out.println("Greatest number is:" + greatestNumber);
	}

}
