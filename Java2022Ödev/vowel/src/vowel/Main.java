package vowel;

public class Main {

	public static void main(String[] args) {
		char char1 = 'A';
		
		switch (char1) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("char is vowel");
			break;
		
		default:
			System.out.println("char is consonant");
		}
		
		}

	}
