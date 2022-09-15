package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "   Today is weather is so beautiful.";
		System.out.println(message);
		
		System.out.println("String length is: " + message.length());
		
		System.out.println("5.character: "+ message.charAt(4));
		System.out.println(message.concat(" Hurray!"));
		
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		
		
		message.getChars(0, 4, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("ay"));
		System.out.println(message.lastIndexOf('e'));
		
		
		System.out.println("-----------------------------------");
		
		String message2 = message.replace(" ", "-");
		System.out.println(message2);
		
		System.out.println(message.substring(2,5));
		
		for (String word:message.split(" "))
		{
			System.out.println(word);
		}
		
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		System.out.println(message.trim());
		
		

	}

}
