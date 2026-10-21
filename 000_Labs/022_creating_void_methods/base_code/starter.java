/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	//method 1
	public static void toString(String a) {
		System.out.println(a);
	}
	
	//method 2
	public static void toStringCombined(String a, String b) {
		System.out.print(a + " ");
		System.out.println(b);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Write a string: ");
		String string1 = sc.nextLine();
		toString(string1);
		
		System.out.print("Write another string to add to the first: ");
		String string2 = sc.nextLine();
		toStringCombined(string1, string2);


		
	}
}
