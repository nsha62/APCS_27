/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int randIndex = (int)(Math.random()*150)+51;
		int [] arr = new int[randIndex];

		int x;
		for (x=50; x<randIndex; x++) {
			arr[x] = (int)(Math.random()*100);
			System.out.print(arr[x] + ", ");
		}

		System.out.println();

		//min
		int min = Integer.MAX_VALUE;
		for (int a = 50; a < arr.length; a++) {
			if (arr[a] < min) {
				min = arr[a];
			}
		}
		System.out.println("Minimum: " + min);

		//max
		int max = Integer.MIN_VALUE;
		for (int a = 50; a < arr.length; a++) {
			if (arr[a] > max) {
				max = arr[a];
			}
		}
		System.out.println("Maximum: " + max);

		//average
		int sum = 0;
		for (int a = 0; a<arr.length; a++) {
			sum = sum + arr[a];
		}
		double average = ((double)sum)/arr.length;
		System.out.println("Average: " + average);

		
	}
}
