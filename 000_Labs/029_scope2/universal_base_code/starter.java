/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = "";
		int a = 0;
		if(shrek.isUgly(true)){
			statement = new String(shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact("shrek");
		for(int i = 0; i < 5; i++){
			shrek.interact(donkey);
			a = a+1;
		}
		System.out.println("That printed out " + a + " times");

	}
}
