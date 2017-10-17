package Lesson3;

import java.lang.reflect.Array;
import java.util.*;

import static Lesson3.extra.scripting;
import static Lesson3.extra.bubblesoring;
import static Lesson3.extra.sumOfIntArray;

public class Lesson {

    public static void main(String[] args){

        /////Extratask: encoding using xor/////
        //encrypting();

        /////Arrays_Task1_from_2_to_20/////
        //arraysTask1();

        /////Arrays_Task2_from_1_to_99/////
        //arraysTask2();

        /////Arrays_Task3_15_int/////
        //arraysTask3();

        /////Arrays_Task4_8_int/////
        //arraysTask4();

        /////Arrays_Task5_two_arrays/////
        //arraysTask5();

        /////Arrays_Task6_increasing_array/////
        arraysTask6();

    }

    /////Extratask: encoding using xor/////
    private static void encrypting() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите строку, которую следует зашифровать");
        String str = scr.nextLine();
        System.out.println("Введите ключ");
        String key = scr.nextLine();
        String answer = scripting(str, key);
        System.out.println(answer);

        answer = scripting(answer, key);
        System.out.println(answer);
    }

    /////Arrays_Task1_from_2_to_20/////
    private static void arraysTask1(){
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = 2 * (i + 1);
        System.out.println(Arrays.toString(array).replace(",", ""));
        System.out.println(Arrays.toString(array).replace(" ", "").replace(",", "\n"));
    }

    /////Arrays_Task2_from_1_to_99/////
    private static void arraysTask2() {
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = 1 + 2 * i;
        }
        System.out.println(Arrays.toString(array));

//        bubble sorting; можно проще, но хочется вспомнить пузырьки
        array = bubblesoring(array, false);
        System.out.println(Arrays.toString(array));
    }

    /////Arrays_Task3_15_int/////
    private static void arraysTask3(){
        int counterofeven = 0;
        int[] array = new int[15];
        Random rndm = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = rndm.nextInt(10);
            if (array[i] % 2 == 0 && array[i] != 0)
            counterofeven += 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("В массиве " + counterofeven + " четных чисел");
    }

    /////Arrays_Task4_8_int/////
    public static void arraysTask4(){
        int[] array = new int[8];
        Random rndm = new Random();
        for (int i = 0; i < 8; i++) {
            array[i] = 1+ rndm.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++){
            array[k] = k % 2 == 0 ? array[k] : 0;
        }
        System.out.println(array.toString());
    }

    /////Arrays_Task5_two_arrays/////
    public static void arraysTask5(){
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rndm = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = rndm.nextInt(6);
            array2[i] = rndm.nextInt(6);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double averegeA = (double)sumOfIntArray(array1) / 5;
        double averegeB = (double)sumOfIntArray(array2) / 5;
        if (averegeA == averegeB)
            System.out.println("Средние арифметические равны (" + averegeA + ")");
        else if (averegeA > averegeB)
            System.out.println("Среднее арифметическое первого массива (" + averegeA + ") больше среднего арифметического второго массива (" + averegeB + ")");
        else
            System.out.println("Среднее арифметическое первого массива (" + averegeA + ") меньше среднего арифметического второго массива (" + averegeB + ")");

    }

    /////Arrays_Task6_increasing_array/////
    public static void arraysTask6(){
        int[] array = new int[4];
        Random rndm = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = 10 + rndm.nextInt(90);
        System.out.println(Arrays.toString(array));
        int[] orderedArray = array.clone();
        orderedArray = bubblesoring(orderedArray, true);
        if (Arrays.equals(orderedArray, array))
            System.out.println("Массив строго возрастающий");
        else
            System.out.println("Массив не строго возрастающий");

    }
}
