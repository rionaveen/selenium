package com.javaprograms;

public class ArrayUsingMatrixAddition {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;

		int b[][] = new int[3][3];
		b[0][0] = 10;
		b[0][1] = 20;
		b[0][2] = 30;
		b[1][0] = 40;
		b[1][1] = 50;
		b[1][2] = 60;
		b[2][0] = 70;
		b[2][1] = 80;
		b[2][2] = 90;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				int c = a[i][j] + b[i][j];
				System.out.println(c);

			}

		}

	}

}
