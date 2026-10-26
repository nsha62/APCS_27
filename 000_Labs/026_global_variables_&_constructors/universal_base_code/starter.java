/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {

	public static void main(String args[]) {
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Ashley");
		BankAccount acc3 = new BankAccount("Jaden", 801);
		
		acc3.checkBalance();
		acc3.displayAccountInfo();

	}
}
