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

		System.out.print("How old are you?: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("What month is your birthday?: ");
		String month = sc.nextLine();

		System.out.print("What day is your birthday?: ");
		int day = sc.nextInt();
		sc.nextLine();

		System.out.print("What year were you born?: ");
		int year = sc.nextInt();
		sc.nextLine();

		System.out.print("How much is a buck fifty?: ");
		double value = sc.nextDouble();


		


	}
}
