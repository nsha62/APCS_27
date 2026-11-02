/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Dog chewy = new Dog("Chewbacca");
		chewy.setAge(11);
		Dog iyla = new Dog("Iyla", "samoyed");

		if (chewy.isSleeping()) {
			System.out.println(chewy.getName() + " is sleeping");
		}
		else {
			chewy.bark();
			if (iyla.isSleeping()) {
				iyla.bark();
			}
			else {
				iyla.bark();
			}
		}
	}
}
