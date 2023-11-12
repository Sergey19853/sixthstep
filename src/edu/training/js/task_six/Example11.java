package edu.training.js.task_six;

public class Example11 {

	public static void main(String[] args) {

		int[] mas = {1, 9, 10, -1, 0, 5, 15};
		int m = 2;
		int l = 1;
		
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] % m == l ? mas[i] + " " : "");
        }
        
	}

}
