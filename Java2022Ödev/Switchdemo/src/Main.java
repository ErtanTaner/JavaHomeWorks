
public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
		case 'A': 
			System.out.println("Perfect: You passed!");
			break;
		case 'B':
			System.out.println("Very Good: You passed!");
			break;
		case 'C':
			System.out.println("Good: You passed!");
			break;
		case 'D':
			System.out.println("Not Bad: You passed!");
			break;
		case 'F':
			System.out.println("Unfortunately You didn't passed");
			break;
		default:
			System.out.println("İnvalid grade");
		}

	}

}
