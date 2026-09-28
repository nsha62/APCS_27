/*
 *	Author: Nisha Cooke
 *  Date: 9/27/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		System.out.println();



		//num1 divisibale
		if (num1%2 == 0){
			System.out.println(num1 + " is divisible by 2!");
			if (num1%3 ==0){ //3
				System.out.println(num1 + " is divisible by 3!");
				if (num1%4 ==0){ //4
					System.out.println(num1 + " is divisible by 4!");
					if (num1%5 ==0){ //5
						System.out.println(num1 + " is divisible by 5!");
					}
					else{
						System.out.println(num1 + " is not divisible by 5");
					}
				}
				else{
					System.out.println(num1 + " is not divisible by 4");
				}
			}
			else{
				System.out.println(num1 + " is not divisible by 3");
			}
		}
		else{
			System.out.println(num1 + " is not divisible by 2");

		}

		//num1 not divisible
		if (num1%3!=0) {
			if (num1%4!=0){
				if (num1%5!=0){
					System.out.println(num1 + " is not divisable by 3, 4, or 5");
				}
				else {
					System.out.println(num1 + " is not divisable by 3, or 4");
				}
			}
			else {
				System.out.println(num1 + " is not divisable by 3");
			}
			
		}
		System.out.println();
		

		//num2
		if (num2%2 == 0){
			System.out.println(num2 + " is divisible by 2!");
			if (num2%3 ==0){ //3
				System.out.println(num2 + " is divisible by 3!");
				if (num2%4 ==0){ //4
					System.out.println(num2 + " is divisible by 4!");
					if (num2%5 ==0){ //5
						System.out.println(num2 + " is divisible by 5!");
					}
					else{
						System.out.println(num2 + " is not divisible by 5");
					}
				}
				else{
					System.out.println(num2 + " is not divisible by 4");
				}
			}
			else{
				System.out.println(num2 + " is not divisible by 3");
			}
		}
		else{
			System.out.println(num2 + " is not divisible by 2");

		}


		//num2 not divisible
		if (num2%3!=0) {
			if (num2%4!=0){
				if (num2%5!=0){
					System.out.println(num2 + " is not divisable by 3, 4, or 5");
				}
				else {
					System.out.println(num2 + " is not divisable by 3, or 4");
				}
			}
			else {
				System.out.println(num2 + " is not divisable by 3");
			}
			
		}


	} 
}
