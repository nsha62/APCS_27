/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		double num1 = Math.max((13-6*11),(30%7*(-2)));
		double num2 = Math.sqrt(3*8+31%7);
		double num3 = Math.pow((37/3),(35%21));
		double num4 = Math.max(Math.pow(2,(14%3)),(35%21));
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println();

		System.out.print("Type a decimal number (x): ");
		double x = sc.nextDouble();
		System.out.print("Type another decimal number (y): ");
		double y = sc.nextDouble();
		System.out.println();

		double max = Math.max(x, y);
		double sqrt = Math.sqrt(y);
		double power = Math.pow(x, y);

		System.out.println("The MAX of the numbers is: " + max);
		System.out.println("The SQUARE ROOT of y" + sqrt);
		System.out.println("x to the POWER of y is: " + power);
		


		
		
	}
}
