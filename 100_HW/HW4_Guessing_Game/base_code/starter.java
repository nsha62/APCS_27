/*
 *	Author: Nisha Cooke
 *  Date: 9/27/26
 * 	Collaborator:
 * 	Note: I used .equals() for a lot of my boolean expressions because I couldn't figure out how to compare 
 * 		  the String guesses using only primitive boolean expressions, hope thats alright!
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//intro
		System.out.println("Welcome to the Guessing Game!");
        System.out.println("You get 3 guesses, and after an incorrect guess, you will receive a hint!");

        //question generator
        int pick = (int)(Math.random()*3) + 1;

        String hint1 = "";
        String hint2 = "";

        if (pick == 1) {
            hint1 = "Hint 1: It is the 5th planet in the solar system";
            hint2 = "Hint 2: It is the biggest planet in our solar system";
        } else if (pick == 2) {
            hint1 = "Hint 1: It is an organ found in the upper torso";
            hint2 = "Hint 2: It has a twin";
        } else {
            hint1 = "Hint 1: It is the country with the largest population in the world";
            hint2 = "Hint 2: It is a subcontinet of the biggest continent on earth";
        }

        //guess 1
        System.out.print("Guess 1: ");
        String guess = sc.nextLine();

        if ((pick == 1 && (guess.equals("Jupiter") || guess.equals("jupiter"))) || (pick == 2 && (guess.equals("Lungs") || guess.equals("lungs"))) || (pick == 3 && (guess.equals("India") || guess.equals("india")))) {
            System.out.println("Congratualations! You got it on the first try!");
        } else {
            System.out.println("Incorrect");
			System.out.println(hint1);

        //guess 2
        System.out.print("Guess 2: ");
        guess = sc.nextLine();

        if ((pick == 1 && (guess.equals("Jupiter") || guess.equals("jupiter"))) || (pick == 2 && (guess.equals("Lungs") || guess.equals("lungs"))) || (pick == 3 && (guess.equals("India") || guess.equals("india")))) {
             System.out.println("Correct on the second try!");
        } else {
            System.out.println("Incorrect");
			System.out.println(hint2);

            //guess 3
            System.out.print("Guess 3: ");
            guess = sc.nextLine();

            if ((pick == 1 && (guess.equals("Jupiter") || guess.equals("jupiter"))) || (pick == 2 && (guess.equals("Lungs") || guess.equals("lungs"))) || (pick == 3 && (guess.equals("India") || guess.equals("india")))) {
                System.out.println("Correct!");
            } else if (pick == 1) {
                System.out.println("Out of guesses! The answer was Jupiter");
            } else if (pick == 2) {
                System.out.println("Out of guesses! The answer was Lungs");
            } else {
                System.out.println("Out of guesses! The answer was India");
            }
            }
        }
    }
}
	

