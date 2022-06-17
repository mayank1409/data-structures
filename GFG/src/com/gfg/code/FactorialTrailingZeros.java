package com.gfg.code;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		System.out.println(countZeros(findFact(num)));

		scanner.close();
	}

	private static int countZeros(BigInteger fact) {
		int zerosCount = 0;
		while (fact.mod(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0) {
			zerosCount++;
			fact = fact.divide(BigInteger.TEN);
		}
		return zerosCount;
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
