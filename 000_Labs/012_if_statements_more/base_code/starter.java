/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num1 = sc.nextInt();
		System.out.print("Input a number: ");
		int num2 = sc.nextInt();

		if (num1 < num2){
			System.out.print(num1 + " is less than " +num2);
		}
		if (num1 > num2){
			System.out.print(num1 + " is greater than " +num2);
		}
		if (num1 == num2){
			System.out.print(num1 + " is equal to " +num2);
		}

	}
}
