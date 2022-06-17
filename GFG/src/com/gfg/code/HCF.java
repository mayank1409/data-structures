package com.gfg.code;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(findHCF(num1, num2));
		scanner.close();
	}

	private static int findHCF(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}

		return findHCF(num2, (num1 % num2));
	}
}
