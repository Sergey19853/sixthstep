package edu.training.js.task_six;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {


        double[] mas = new double[5];
        double z = 2.5;
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
            	mas[i] = z;
                count++;
            }
        }
 
        System.out.println("Количество замен: " + count);
  

	}

}
