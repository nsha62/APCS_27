/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		//welcome
		System.out.println("===========================================");
		System.out.println("         WELCOME RESTAURANT OWNER");
		System.out.println("===========================================");
		System.out.println();

		//restaurant + user variables
		System.out.print("What's the name of your restaurant? ");
		String restaurant = sc.nextLine();
		System.out.print("What's your name? ");
		String user = sc.nextLine();
		System.out.println();

		System.out.println("Great to see you, " + user + "! Lets set up a menu for " + restaurant + "!");

		//menu
		System.out.println("Tonight's menu has room for 3 items. Let's go!");
		System.out.println();

		//item 1
		System.out.println("--- Item #1 ---");
		System.out.println("Item name: ");
		String item1 = sc.nextLine();
		System.out.print("Price of " + item1 + " ($): ");
		double price1 = sc.nextDouble();
		System.out.print("How many " + item1 +"s would you like? ");
		int amt1 = sc.nextInt();
		sc.nextLine();
		double cost1 = price1 * amt1;
		System.out.println("Added " + amt1 + "x " + item1 + " to your order: $" + cost1);
		System.out.println();

		//item 2
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2 = sc.nextLine();
		System.out.print("Price of " + item2 + " ($): ");
		double price2 = sc.nextDouble();
		System.out.print("How many " + item2 +"s would you like? ");
		int amt2 = sc.nextInt();
		sc.nextLine();
		double cost2 = price2 * amt2;
		System.out.println("Added " + amt2 + "x " + item2 + " to your order: $" + cost2);
		System.out.println();

		//item 3
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3 = sc.nextLine();
		System.out.print("Price of " + item3 + " ($): ");
		double price3 = sc.nextDouble();
		System.out.print("How many " + item3 +"s would you like? ");
		int amt3 = sc.nextInt();
		double cost3 = price3 * amt3;
		System.out.println("Added " + amt3 + "x " + item3 + " to your order: $" + cost3);
		System.out.println();

		//tip input
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex. 15, 18, 20): ");
		int tipPercent = sc.nextInt();
		System.out.println();
		
		//subtotal
		double subtotal = cost1 + cost2 + cost3;

		//tip calculation
		double tipDecimal = tipPercent/100;
		double tipAmt = tipDecimal*subtotal;

		//tax
		double tax = subtotal * 0.0975;

		//receipt
		System.out.println("===========================================");
		System.out.println("      " + restaurant + " - Menu For Today      ");
		System.out.println("===========================================");
		System.out.println("Owner: " + user);
		System.out.println("-------------------------------------------");
		System.out.println("Item             Qty        Price");
		System.out.println("-------------------------------------------");
		System.out.println(item1 + "         " + amt1 + "            " + price1);
		System.out.println(item2 + "         " + amt2 + "            " + price2);
		System.out.println(item3 + "         " + amt3 + "            " + price3);
		System.out.println("-------------------------------------------");
		System.out.println("Subtotal:                    " + subtotal);
		System.out.println("Tax (9.75%):                 " + tax);
		System.out.println("Tip %:                       " + tipPercent);
		System.out.println("Tip Amount:                  " + tipAmt);
		System.out.println("===========================================");
		double total = subtotal + tax + tipAmt;
		System.out.println("TOTAL:                      $" + total);


		

	}
}
