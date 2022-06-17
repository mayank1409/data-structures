package com.gfg.code;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(findFact(num));
		
		scanner.close();
	}

	private static BigInteger findFact(int num) {
		
		BigInteger fact = BigInteger.ONE;
		
		while (num > 0) {
			fact = fact.multiply(BigInteger.valueOf(num));
			num--;
		}
		
		return fact;
	}
}
