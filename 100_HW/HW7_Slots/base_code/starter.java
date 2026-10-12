/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less or equal to your total amount of money");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		System.out.println("   a. If two numbers match, your wager doubles");
		System.out.println("   b. If three numbers match, your wager triples");
		System.out.println("   c. If none match, you lose your wager");
		System.out.println("----------------------------------------------------------------");
		System.out.println();

		System.out.println("Would you like to play the slots? (yes/no)");
		String wantToPlay = sc.nextLine();

		if (wantToPlay.equals("yes")||wantToPlay.equals("Yes")||(wantToPlay.equals("y"))||(wantToPlay.equals("Y"))) {
			int money = 100;
			int wager = 0;

			while (money > 0) {
				System.out.print("How much would you like to wager?: ");
				wager = sc.nextInt();

				int roll1 = (int)(Math.random()*10)+1;
				int roll2 = (int)(Math.random()*10)+1;
				int roll3 = (int)(Math.random()*10)+1;

				System.out.println("Great! Lets play!");
				System.out.println("Your rolls are:");
				System.out.println("------------------------");
				System.out.println(" | " + roll1 + " | " + roll2 + " | " + roll3 + " | ");
				System.out.println("------------------------");
				
				if ((roll1==roll2)&&(roll1==roll3)&&(roll2==roll3)) {
					System.out.println("You hit the jackpot! You're wager has been tripled");
					money = money + (3*wager);
					System.out.println("You now have $" + money);
				}
				else if ((roll1==roll2)||(roll1==roll3)||(roll2==roll3)) {
					System.out.println("You won! You're wager has been doubled");
					money = money + (2*wager);
					System.out.println("You now have $" + money);
				}
				else if (money<1) {
					break;
				}
				else {
					System.out.println("You didn't win this time, better luck next time!");
					money = money - wager;
					System.out.println("You now have $" + money);
				}
				
			}
		}
		else {
			System.out.println("You still have $100 left. Come again when you actually want to play");
		}

		
			
			

		
		
	}
}
