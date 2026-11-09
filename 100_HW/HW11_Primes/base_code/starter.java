/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        printPrimes(a);
	}

	public static boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= a) {
            if (a % divisor == 0) {
                return false;
            }
            divisor = divisor + 1;
        }
        return true;
    }

    public static void printPrimes(int a) {
        int num = 0;
        while (num < a) {
            if (checkPrime(num)) {
                System.out.println(num);
            }
            num = num + 1;
        }
    }
}
