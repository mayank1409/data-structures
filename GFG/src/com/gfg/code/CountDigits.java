package com.gfg.code;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int ans = 0;
		while (n > 0) {
			n /= 10;
			ans++;
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
