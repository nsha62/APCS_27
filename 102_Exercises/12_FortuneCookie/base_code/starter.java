/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		//menu
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println("Hit enter to see your Fortune");
		String click = sc.nextLine();


		//generate fortune
		int message = (int)(Math.random()*11) + 1;

		if (message == 1) {
			System.out.print("Your next chapter begins with confidence.");
		}
		if (message == 2) {
			System.out.print("A small act of kindness will return to you soon.");
		}
		if (message == 3) {
			System.out.print("Opportunity arrives when you least expect it.");
		}
		if (message == 4) {
			System.out.print("Your ingenuity and imagination will get results.");
		}
		if (message == 5) {
			System.out.print("The limit to your abilities is where you place it.");
		}
		if (message == 6) {
			System.out.print("A stranger will cross your path who later becomes your friend.");
		}
		if (message == 7) {
			System.out.print("Do it scared.");
		}
		if (message == 8) {
			System.out.print("A closed mouth gathers no feet.");
		}
		if (message == 9) {
			System.out.print("Look how far you've come.");
		}
		if (message == 10) {
			System.out.print("The fortune you seek is in another cookie.");
		}

		

	}
}
