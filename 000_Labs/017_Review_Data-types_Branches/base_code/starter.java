/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome adventurer!");
		//name
		System.out.print("What is your character's name?: ");
		String name = sc.nextLine();

		//title
		System.out.print("What is your character's title?: ");
		String title = sc.nextLine();

		//role
		System.out.println();
		System.out.println("What is your character's role? (Wizard, Fighter, or Rogue");
		String role = sc.nextLine();
		System.out.println();

		if ((role.equals("Wizard")||role.equals("wizard")) || (role.equals("Fighter")||role.equals("fighter")) || (role.equals("Rogue")||role.equals("rogue"))) {
			System.out.println("You are a " + role + "!");
		}
		else {
			System.out.println("Looks like something is wrong with your input. Try again and check your spelling and make sure you chose one of the three options.");
			role = sc.nextLine();
		}
		System.out.println();

		//stats
		System.out.println("Now you must determine your stats! ");
		System.out.println("You have 20 points to spend on the following skills: Strength, Dexterity, Intelligence, Charisma");
		int points = 20;
		
		//strength
		System.out.println("What is your character's strength stat? (1-10)");
		int str = sc.nextInt();
		if (str > 10) {
		System.out.println("Thats over the max amount of points. Your strength has been set to 10.");
		str = 10;
				}
		if (str > points) {
		System.out.println("You don't have that many points left. Your strength has been set to " + points);
		str = points;
				}
		points = points - str;
		System.out.println("Points left: " + points);
		
		//dexterity
		System.out.println("What is your character's dexterity stat? (1-10)");
		int dex = sc.nextInt();
		if (dex > 10) {
		System.out.println("Thats over the max amount of points. Your dexterity has been set to 10.");
		dex = 10;
				}
		if (dex > points) {
		System.out.println("You don't have that many points left. Your dexterity has been set to " + points);
		dex = points;
				}
		points = points - dex;
		System.out.println("Points left: " + points);
		
		//intelligence
		System.out.println("What is your character's intelligence stat? (1-10)");
		int intel = sc.nextInt();
		if (intel > 10) {
		System.out.println("Thats over the max amount of points. Your intelligence has been set to 10.");
		intel = 10;
				}
		if (intel > points) {
		System.out.println("You don't have that many points left. Your intelligence has been set to " + points);
		intel = points;
				}
		points = points - intel;
		System.out.println("Points left: " + points);
		
		//charisma
		System.out.println("What is your character's charisma stat? (1-10)");
		int cha = sc.nextInt();
		if (cha > 10) {
		System.out.println("Thats over the max amount of points. Your charisma has been set to 10.");
		cha = 10;
				}
		if (cha > points) {
		System.out.println("You don't have that many points left. Your charisma has been set to " + points);
		cha = points;
				}
		points = points - cha;
		System.out.println("Points left: " + points);
		
		//final character
		System.out.println();
		System.out.println("You are " + name + ", " + title);
		System.out.println("You are a " + role + " with the following stats:");
		System.out.println("Strength: " + str);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Charisma: " + cha);
		
	}
}

		//stats
		// System.out.println("Now you must determine your stats! ");
		// System.out.println("You have 20 points to spend on the following skills: Strength, Dexterity, Intellegence, Charisma");
		// int points = 20;
		
		// //strength
		// System.out.println("What is your character's strength stat? (1-10)");
		// int str = sc.nextInt();
		// if (str > 10) {
		// 	System.out.println("Thats over the max amount of points. Input a number less than or equal to 10");
		// 	str = sc.nextInt();
		// 	points = points - 10;
		// }
		// if (points < 20) {
			
		// }


		// //dexterity
		// System.out.println("What is your character's dexterity stat? (1-10)");
		// int dex = sc.nextInt();
		// if (dex > 10) {
		// 	System.out.println("Thats over the max amount of points. Your dexterity has been set to 10.");
		// 	dex = 10;
		// }
		// //intellegence
		// System.out.println("What is your character's intellegence stat? (1-10)");
		// int intel = sc.nextInt();
		// if (intel > 10) {
		// 	System.out.println("Thats over the max amount of points. Your intellegence has been set to 10.");
		// 	intel = 10;
		// }
		// //charisma
		// System.out.println("What is your character's charisma stat? (1-10)");
		// int cha = sc.nextInt();
		// if (cha > 10) {
		// 	System.out.println("Thats over the max amount of points. Your charisma has been set to 10.");
		// 	cha = 10;
		// }


	
