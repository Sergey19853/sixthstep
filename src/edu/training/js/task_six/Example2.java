package edu.training.js.task_six;

public class Example2 {

	public static void main(String[] args) {

		int[] mas = new int[] {10, 0, 11, 12, 0, 15, 0, 0, 50, 0, 0};
		int count = 0;
		
		for(int i = 0; i < mas.length; i++ ) {
			if(mas[i] == 0) {
				count++;
			}
		}

		int[] newMas = new int[count];
		int j = 0;
		for(int i = 0; i < mas.length; i++ ) {
			if(mas[i] == 0) {
				newMas[j] = i;
				System.out.println(newMas[j]);
				j++;
			}
		}
	}

}
