package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	Scanner sc = new Scanner(System.in);
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String a) {
		actor = a;
		age = 0;
		villain = "unkown";
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int b) {
		actor = "unkown";
		age = b;
		villain = "unknown";
	}
	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String a, int b) {
		actor = a;
		age = b;
		villain = "unknown";
	}
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(String a, int b, String c) {
		actor = a;
		age = b;
		villain = c;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge

	public int setAge() {
		int input = sc.nextInt();
		age = input;
		return age;
	}

	public String setActor() {
		String input = sc.nextLine();
		actor = input;
		return actor;
	}

	public String setVillain() {
		String input = sc.nextLine();
		villain = input;
		return villain;
	}

	public void getAge() {
		System.out.println(age);
	}

	public void getActor() {
		System.out.println(actor);
	}

	public void getVillain() {
		System.out.println(villain);
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
