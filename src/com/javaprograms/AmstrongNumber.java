package com.javaprograms;

import java.util.Scanner;

public class AmstrongNumber {
	Scanner sc = new Scanner(System.in);

	public void amstrong() {

		int n = 371;
		// int n= sc.nextInt();
		System.out.println("enter the number");
		int a = n;

		int i, j = 0;

		while (n > 0) {
			i = n % 10;
			j = j + (i * i * i);
			n = n / 10;

		}
		if (a == j) {
			System.out.println("amstrong" + j);
		} else {
			System.out.println("not a amstrong number");
		}

	}

	public void amstrongCount() {

		// int n = 371;
		int c = 0;

		int a, n, i;

		for (n = 1; n < 1000; n++) {
			a = n;
			int j = 0;

			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;

			}
			if (n == j) {
				System.out.println("amstrong" + j);
				c++;
			}
		}
		System.out.println("count  of the amstrong number is" + c);
	}

	public static void main(String[] args) {
		AmstrongNumber am = new AmstrongNumber();

		am.amstrong();
		am.amstrongCount();

	}

}
