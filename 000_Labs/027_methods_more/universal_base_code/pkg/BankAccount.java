	/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	private int accountNum;
	private double balance;
	private boolean isActive;
	private static int nextAccountNum = (((int)Math.random()) * 950) + 50;

	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "unknown";
		balance = 0;
		isActive = true;
		accountNum = nextAccountNum;
		nextAccountNum = nextAccountNum + 1;
	}

	public BankAccount(String a) {
		owner = a;
		balance = 0;
		isActive = false;
		accountNum = nextAccountNum;
		nextAccountNum = nextAccountNum + 1;
	}

	public BankAccount(String a, double b) {
		owner = a;
		balance = 0;
		isActive = false;
		accountNum = nextAccountNum;
		nextAccountNum = nextAccountNum + 1;
	}

	public BankAccount(String a, boolean c) {
		owner = a;
		balance = 0;
		isActive = c;
		accountNum = nextAccountNum;
		nextAccountNum = nextAccountNum + 1;
	}

	public BankAccount(String a, double b, boolean c) {
		owner = a;
		balance = b;
		isActive = c;
		accountNum = nextAccountNum;
		nextAccountNum = nextAccountNum + 1;
	}
	

	// -------METHODS-------
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	public void displayAccountInfo() {
        System.out.println("Owner: " + owner);
		System.out.println("Balance: " + balance);
		if (isActive == true) {
			System.out.println("Status: Active");
		}
		else {
			System.out.println("Status: Inactive");
		}
		System.out.println("Account Number: " + accountNum);

    }
	
}

