package edu.training.js.task_six;

public class Example3 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {0,2,3,4,-9};
        Boolean flag = false;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != 0) {
            	if (mas[i] < 0) {
                    flag = true;
                    break;
                }else {
                	break;
                }            	
            }
        }

        if (flag) {
            System.out.println("Отрицательное число встречается раньше. ");
        } else {
            System.out.println("Положительное число встречается раньше. ");
        }

	}

}
