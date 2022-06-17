package com.gfg.code;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		boolean isPalindrome = isPalindrome(n);
		
		if (isPalindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("Not a PALINDROME");
		}
		
		scanner.close();
	}

	private static boolean isPalindrome(int n) {
		if (n != 0 && n % 10 == 0) {
			return false;
		}
		
		int rev = 0;
		while (n > rev) {
			int lastDigit = n%10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		return (n == rev || n == rev/10);
	}
}
