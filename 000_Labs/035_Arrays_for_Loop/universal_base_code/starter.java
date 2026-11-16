/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];

		for (int x = 0; x<1000; x++) {
			int num = (int)(Math.random()*1000);
			arr[x] = num;
			System.out.println(arr[x]);
		}

		
	}
}
