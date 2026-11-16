/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int [] arr2 = new int[1001];
		 int num1 = 0;
		 int num2 = 0;
		 int x = 0;
		 int y = 1001;

		 System.out.println("Array 1:");
		 while (num1<=1000) {
			arr1[x] = arr1[x] +3 ;
			System.out.print(arr1[x] + " ");
			num1=num1+1;
		 }
		System.out.println();
		System.out.println();
		System.out.println("Array 2:");
		 while (num2 <= 1000) {
			arr2[num2] = arr2[num2] + (y-1);
			System.out.print(arr2[num2] + " ");
			num2 = num2 + 1;
			y = y-1;
		 }
	}
}
