package Lesson1;

import HomeWork.Lesson2.Additional_Helping;

public class Lesson1_Task4 {
    public static void main(String[] args) {

        int n = 454;

        int[] array = Additional_Helping.getArrayOfNumeralsOfNumber(n);

        int sum = 0;

        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];

        System.out.println("Сумма цифр трехзначного числа n: " + sum);

    }
}