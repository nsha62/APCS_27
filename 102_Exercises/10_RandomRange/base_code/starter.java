/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random numbers");
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();

		System.out.print("Please enter another integer (bigger than the first): ");
		int num2 = sc.nextInt();

		System.out.println();

		System.out.println("Your range is " + num1 + " to " + num2);
		System.out.println("Here are 5 numbers generated in that range");

		int diff = num2 - num1;

		int int1 = (int)(Math.random()*diff)+num1;
		int int2 = (int)(Math.random()*diff)+num1;
		int int3 = (int)(Math.random()*diff)+num1;
		int int4 = (int)(Math.random()*diff)+num1;
		int int5 = (int)(Math.random()*diff)+num1;

		System.out.println(int1+ ", " + int2 + ", " + int3 + ", " + int4 + ", " + int5);
	}
}
