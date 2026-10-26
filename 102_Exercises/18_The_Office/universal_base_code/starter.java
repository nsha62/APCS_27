/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();

		Employee ashley = new Employee(1012, "Ashley", "Heo", 9568.97);
		ashley.employeeToString();

		michael.raiseSalary(5);
		dwight.raiseSalary(10);
		pam.raiseSalary(20);

		System.out.println("Michael: Salary - " + michael.getSalary()); 
		System.out.println("         Annual Salary - " + michael.getAnnualSalary());
		System.out.println("Dwight: Salary - " + dwight.getSalary()); 
		System.out.println("        Annual Salary - " + dwight.getAnnualSalary());
		System.out.println("Jim: Salary - " + jim.getSalary()); 
		System.out.println("     Annual Salary - " + jim.getAnnualSalary());
		System.out.println("Pam: Salary - " + pam.getSalary()); 
		System.out.println("     Annual Salary - " + pam.getAnnualSalary());
		System.out.println("Ashley: Salary - " + ashley.getSalary()); 
		System.out.println("        Annual Salary - " + ashley.getAnnualSalary());






	}
}
