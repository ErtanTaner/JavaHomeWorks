package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10 ; i++) 
		{
			System.out.println(i);
		}
		System.out.println("Loop is over");
		for (int i = 2; i < 10 ; i+=2) 
		{
			System.out.println(i);
		}
		System.out.println("Loop is over");
		//-----------------------------------
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop is over");
		
		int x = 2;
		
		while (x < 10) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("While loop is over");
		int j = 1;
		do {
				System.out.println(j);
				j+=2;
			}while (j < 10);
		System.out.println("Do-While loop is over");
		int k = 100;
		do {
			System.out.println(k);
			k+=2;
		}while (k < 10); 
		System.out.println("Do-While loop is over");
		
		
	}
	
	
}



