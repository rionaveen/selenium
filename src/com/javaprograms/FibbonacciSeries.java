package com.javaprograms;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int len = 15;
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i < len; i++) {
			int n3;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}

	}

}
