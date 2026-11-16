/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

		//generate array
		System.out.println("---------------------------------------------");
		System.out.println("These are the 20 numbers");
		int [] arr = new int[20];
		for (int x=0; x<20; x++) {
			arr[x] = ((int)(Math.random()*11) +1);
			System.out.print(arr[x] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");

		//pick rand num
		int rand = (int)(Math.random()*11);
		System.out.println("The random number to look for is " + rand);

		//check duplicates
		int dup = 0;
		for (int x=0; x<20; x++) {
			if (rand == arr[x]) {
				dup = dup+1;
				System.out.println("Duplicate found at index " + x);
			}
		}
		System.out.println("Total number of duplicates for " + rand + " is " + dup);
		System.out.println("---------------------------------------------");

		//2 in a row
		System.out.println("Looking for two in a row:");
		for (int x=0; x<(arr.length-1); x++) {
			if (arr[x] == arr[x+1]) {
				System.out.println("Two in a row found at indexes " + x + " and " + (x+1) +". The number is " + arr[x]); 
			}
			
		}



	}
}
