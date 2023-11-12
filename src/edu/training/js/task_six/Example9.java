package edu.training.js.task_six;

public class Example9 {

	public static void main(String[] args) {
		
        double[] mas = new double[]{0.0,2.1,3.1,4.1,-9.5};
        int minIndex = 0;
        int maxIndex = 0;
        double min;
        double max;

        min = mas[0];
        max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                minIndex = i;
            } else if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
        }

        double temp = mas[minIndex];
        mas[minIndex] = mas[maxIndex];
        mas[maxIndex] = temp;

		for(int i = 0; i < mas.length; i++ ) {	
			System.out.println(mas[i]);							
		}


	}

}
