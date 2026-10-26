/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play?");
        while(true){
            String answer = sc.nextLine().trim();

            if (answer.equalsIgnoreCase("done")) {
                System.out.println("Thanks for playing!");
                break;
            } 
            else if(answer.equalsIgnoreCase("yes")) {
                System.out.println("Do you choose rock, paper, or scissors?");
                    answer = sc.nextLine();

                if(!answer.equalsIgnoreCase("rock") && !answer.equalsIgnoreCase("paper") && !answer.equalsIgnoreCase("scissors")){
                    System.out.println("Invalid choice. Please choose rock, paper, or scissors:");
                    answer = sc.nextLine();
                }

                String computerChoice = getObject();
                System.out.println("Computer chose: " + computerChoice);
                int result = compare2(answer, computerChoice);

                if (result == 0) {
                    System.out.println("It's a tie!");
                } 
                else if(result == 1) {
                    System.out.println("You win!");
                } 
                else {
                 System.out.println("Computer wins!");
                }
            } 
            else if(answer.equalsIgnoreCase("no")) {
       
                System.out.println("How many times should the computer play itself?");
                int times = sc.nextInt();
                sc.nextLine();

                int scoreP1 = 0;
                int scoreP2 = 0;
                int ties = 0;
                int i = 0;

                while(i < times) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);

                    if(result == 0) {
                        ties++;
                    } 
                    else if(result == 1) {
                        scoreP1++;
                    } 
                    else {
                        scoreP2++;
                    }
                    i++;
                }

                System.out.println("Total Games: " + times);
                System.out.println("Player 1 wins: " + scoreP1);
                System.out.println("Player 2 wins: " + scoreP2);
                System.out.println("Ties: " + ties);
            }
            else {
                System.out.println("Invalid input. Please type yes, no, or done.");
            }
        }
    }

public static String getObject() {
    int a = (int)(Math.random() * 3);
    if(a == 0) {
        return "rock";
    } 
    else if(a == 1) {
        return "paper";
    } 
    else {
    return "scissors";
    }
}

public static int compare2(String a, String b) {
    if(a.equals(b)) {
        return 0;
    }
  
    if((a.equals("rock") && b.equals("scissors")) || (a.equals("paper") && b.equals("rock")) || (a.equals("scissors") && b.equals("paper"))) {
        return 1;
    } 
    else {
        return 2;
    } 
}
}
