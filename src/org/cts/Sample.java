package org.cts;

public class Sample {

	public static void main(String[] args) {
		int a[] = { 8, 13, 1, 7, 21, 11, 43 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] <a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
		}
		
		

	}

}
