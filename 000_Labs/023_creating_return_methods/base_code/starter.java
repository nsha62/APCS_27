/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	//pow method
	public static int pow(int num1, int num2) {
		int times = 0;
		int total = 1;
		while (times != num2) {
			total = total * num1;
			times = times + 1;
		}
		System.out.print("The result is: " + total);
		return total;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is your base number?: ");
		int x = sc.nextInt();
		System.out.print("What is your exponent?: ");
		int y = sc.nextInt();

		pow(x, y);
	}
}
