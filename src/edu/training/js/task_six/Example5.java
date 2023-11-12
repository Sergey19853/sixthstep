package edu.training.js.task_six;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

        int[] mas = new int[5];
        int count = 0;
        Boolean flag = false;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
            	count++;
                flag = true;
            }
        }
        
        if (count > 0){
        	 int[] newMas = new int[count];
             for (int i = 0, j = 0; i < mas.length; i++) {
                 if (mas[i] % 2 == 0) {
                 	newMas[j] = mas[i];
                 	System.out.println(newMas[j]);
                    j++;
                 }
             }
        }


        if (flag == false) {
            System.out.println("Последовательность не содержит четных чисел");
        }

	}

}
