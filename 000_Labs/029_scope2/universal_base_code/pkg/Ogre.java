/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;
	public boolean ugly;

	public Ogre() {
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(boolean ugly){
		
		if (ugly == true) {
			return true;
		}
	}

	public void interact(Donkey donkey){
		System.out.println(donkey + ", what are you doing in my swamp?!");
		return;
	}


}
