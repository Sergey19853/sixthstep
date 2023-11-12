package edu.training.js.task_six;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
        int[] mas = new int[5];
        int max;
        int min;
        int axleLength;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextInt();
        }
        
        max = mas[0];
        min = mas[0];
        for (int i = 0; i < mas.length; i++) {
        	if (mas[i] > max) {
        		max = mas[i];
        	}
        	if (mas[i] < min) {
        		min = mas[i];
        	}
        }
        axleLength = max - min;
        System.out.println("Найменьшая длина числовой оси = " + axleLength);
		
		
	}

}
