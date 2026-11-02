/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf d1 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d2 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d3 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d4 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d5 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d6 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
		PooleDwarf d7 = new PooleDwarf(randName(), (int)(Math.random()*100)+1);

		int count = 0;
		if (d2.isSameName(d1.getName())) {
			count = count + 1;
		}
		if (d3.isSameName(d1.getName())) {
			count = count + 1;
		}
		if (d4.isSameName(d1.getName())) {
			count = count + 1;
		}
		if (d5.isSameName(d1.getName())) {
			count = count + 1;
		}
		if (d6.isSameName(d1.getName())) {
			count = count + 1;
		}
		if (d7.isSameName(d1.getName())) {
			count = count + 1;
		}
		
		System.out.print(d1 + " has " + count + " duplaicates");
	}
}
