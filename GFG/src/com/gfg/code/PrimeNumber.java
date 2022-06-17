package com.gfg.code;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(isPrime(num));
		
		scanner.close();
	}

	private static boolean isPrime(int num) {
		
		if (num == 1) return false;
		
		if (num == 2 || num == 3) return true;
		
		if (num % 2 == 0 || num % 3 == 0) return false;
		
		for (int i = 5; i <= Math.sqrt(num); i+=6) {
			if (num % i == 0 || (num % (i+2) == 0)) {
				return false;
			}
		}
		return true;
	}
}
