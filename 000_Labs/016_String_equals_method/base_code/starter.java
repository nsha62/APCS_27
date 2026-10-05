/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello avdenturer! Choose your class: Wizard, Warrior, or Rogue");
		String choice = sc.nextLine();

		if ((choice.equals("Wizard")||choice.equals("wizard")) || (choice.equals("Warrior")||choice.equals("warrior")) || (choice.equals("Rogue")||choice.equals("rogue"))) {
			System.out.println("You are a " + choice + "!");
		}
		else {
			System.out.println("Looks like something is wrong with your input. Check your spelling and make sure you chose one of the tree options.");
		}

		

	}
}
