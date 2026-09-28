/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int answer = (int)(Math.random()*1000)+1;

		System.out.print("Guess a number from 1 to 1000: ");
		int guess = sc.nextInt();

		if(guess == answer){
			System.out.print("CONGRAGULATIONS!! You guessed the number correctly!");
		}
		else{
			System.out.println("Incorrect");
			System.out.println("The number was: "+answer);
		}
	}
}
