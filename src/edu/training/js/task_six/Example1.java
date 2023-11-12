package edu.training.js.task_six;

import java.util.Random;

public class Example1 {

	public static void main(String[] args) {
		
		int k = 2;
		int[] a = new int[10];
		int sum = 0;
		
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		
		System.out.println(sum);
	}

}
