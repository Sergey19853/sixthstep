package edu.training.js.task_six;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {

        int[] mas = new int[5];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextInt();
        }
        
        System.out.println("Числа, для которых а[i] > i: ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.println("ar[" + i + "] = " + mas[i]);
            }
        }

	}

}
