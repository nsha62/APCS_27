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
		System.out.print("Input another number: ");
		int num2 = sc.nextInt();
		System.out.print("Input ANOTHER number: ");
		int num3 = sc.nextInt();

		//greatest
		if ((num1>num2)&&(num1>num3)){
			System.out.println(num1 + " is the greatest number!");
		}
		if ((num2>num1)&&(num2>num3)){
			System.out.println(num2 + " is the greatest number!");
		}
		if ((num3>num2)&&(num3>num1)){
			System.out.println(num3 + " is the greatest number!");
		}

		//smallest
		if ((num1<num2)&&(num1<num3)){
			System.out.println(num1 + " is the lowest number!");
		}
		if ((num2<num1)&&(num2<num3)){
			System.out.println(num2 + " is the lowest number!");
		}
		if ((num3<num2)&&(num3<num1)){
			System.out.println(num3 + " is the lowest number!");
		}
	}
}
