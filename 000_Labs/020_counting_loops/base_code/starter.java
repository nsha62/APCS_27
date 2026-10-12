/*
 *	Author:
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is your name?: ");
		String name = sc.nextLine();
		System.out.print("How many times do you want to print your name?: ");
		int want = sc.nextInt();

		int printed = 0;

		while (printed <= want) {
			System.err.println(name);
			printed = printed + 1;
		}



		
	}
}
