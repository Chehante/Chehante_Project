package HomeWork.Lesson2;

import java.util.Scanner;

public class Lesson2_Task16_amount_of_numerals {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите натуральное число любой длины, для которого требуется \n посчитать сумму цифв:");
        int number = scr.nextInt();

        int[] array = Additional_Helping.getArrayOfNumeralsOfNumber(number);

        int sum = 0;
        for (int k:
             array) {
            sum += k;
        }
        System.out.println(sum);
    }
}
