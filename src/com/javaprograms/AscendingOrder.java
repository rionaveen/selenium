package com.javaprograms;

public class AscendingOrder {

	public static void main(String[] args) {

		int a[] = { 80, 70, 40, 10, 110, 29 };
		
		int temp;

		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					
					temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;

				}

			}

		}

//		for (int k= 0; k< a.length; k++) {
//			
//			System.out.println(a[k]);
//		}

		for (int h : a) {
			
			System.out.println(h);
			
		}
	}
}
