package edu.training.js.task_six;

public class Example8 {

	public static void main(String[] args) {

		int[] mas = new int[] {0,2,3,4,-9};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                positiveCount++;
            } else if (mas[i] == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }
     
        System.out.println(positiveCount + " положительных, " + negativeCount + " отрицательных, " + zeroCount + " нулевых элементов");
      
	}

}
