package Lesson3;

import java.lang.reflect.Array;
import java.util.*;

import static Lesson3.extra.scripting;
import static Lesson3.extra.bubblesoring;
import static Lesson3.extra.sumOfIntArray;

public class Lesson_Arrays {

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
        //arraysTask6();

        /////Arrays_Task7_fibonachi_array/////
        //arraysTask7();

        /////Arrays_Task8_max_of_last/////
        //arraysTask8();

        /////Arrays_Task9_3_arrays/////
        //arraysTask9();

        /////Arrays_Task10_1_0/////
        //arraysTask10();

        /////Arrays_Task10_1_0/////
        //arraysTask10();

        /////Arrays_Task11_right_left/////
        //arraysTask11();

        /////Arrays_Task12_equal_quantity_positive_negative/////
        //arraysTask12();

        /////Arrays_Task13_positive_array/////
        arraysTask13();

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

    /////Arrays_Task7_fibonachi_array/////
    public static void arraysTask7(){
        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i<20; i++)
            array[i] = array[i-2] + array[i-1];
        System.out.println(Arrays.toString(array));
    }

    /////Arrays_Task8_max_of_last/////
    public static void arraysTask8(){
        int[] array = new int[12];
        Random rndm = new Random();
        int indexmax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -15 + rndm.nextInt(31);
            if (array[i] >= array[indexmax])
                indexmax = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Индекс последнего максимального элемента массива: " + indexmax);

    }

    /////Arrays_Task9_3_arrays/////
    public static void arraysTask9(){
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] arrayfinal = new double[10];
        Random rndm = new Random();
        int quantityOfInt = 0;
        for (int i = 0; i < 10; i++) {
            array1[i] = 1 + rndm.nextInt(9);
            array2[i] = 1 + rndm.nextInt(9);
            arrayfinal[i] = (double)array1[i]/array2[i];
            if (arrayfinal[i]%1 == 0)
                quantityOfInt += 1;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arrayfinal));
        System.out.println("Количество целых в последнем массиве: " + quantityOfInt);

    }

    /////Arrays_Task10_1_0/////
    public static void arraysTask10() {
        int[] array = new int[11];
        Random rndm = new Random();
        int count0 = 0;
        int count1 = 0;
        int countminus1 = 0;
        for (int i = 0; i < 11; i++) {
            array[i] = -1 + rndm.nextInt(3);
            switch (array[i]) {
                case 1:
                    count1++;
                    break;
                case -1:
                    countminus1++;
                    break;
            }
            count0 = array.length - count1 - countminus1;
        }
        System.out.println(Arrays.toString(array));
        int max = Integer.max(Integer.max(count1, countminus1), count0);
        if (!(count0 == count1 || count0 == countminus1 || count1 == countminus1))
            System.out.println(max);

    }

    /////Arrays_Task11_right_left/////
    public static void arraysTask11() {

        Scanner scr = new Scanner(System.in);
        Random rndm = new Random();
        int sumLeft = 0;
        int sumRight = 0;
        int n;

        do {
            System.out.print("Введите четное число, обозначающее размер одномерного массива: ");
            n = scr.nextInt();
        }
        while (n % 2 != 0);

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = -5 + rndm.nextInt(11);
            if (i < n/2)
                sumLeft += Math.abs(array[i]);
            else
                sumRight += Math.abs(array[i]);
        }
        String operand;
        if (sumLeft < sumRight)
            operand = "меньше";
        else if (sumLeft > sumRight)
            operand = "больше";
        else
            operand = "равна";



        System.out.println(Arrays.toString(array));
        System.out.println("Сумма левой половины массива (" + sumLeft + ") " + operand + " правой половины массива (" + sumRight + ")");

    }

    /////Arrays_Task12_equal_quantity_positive_negative/////
    public static void arraysTask12() {

        Random rndm = new Random();
        int quantityPositive = 0;
        int quantityNegative = 0;

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            do {array[i] = -10 + rndm.nextInt(21);}
            while (array[i] == 0 || quantityPositive == 6 && array[i] > 0 || quantityNegative == 6 && array[i] < 0);
            if (array[i] < 0)
                quantityNegative += 1;
            else
                quantityPositive += 1;

        }
        System.out.println(Arrays.toString(array));
    }

    /////Arrays_Task13_positive_array/////
    public static void arraysTask13(){
        Scanner scr = new Scanner(System.in);
        Random rndm = new Random();
        int sumEven = 0;
        int n;

        do {
            System.out.print("Введите число больше 3, обозначающее размер одномерного массива: ");
            n = scr.nextInt();
        }
        while (n <= 3);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = rndm.nextInt(n);
            if (array[i]%2 == 0 && array[i] != 0)
            sumEven += 1;
        }

        System.out.println(Arrays.toString(array));

        if (sumEven > 0){
            int[] arrayEven = new int[sumEven];
            int k = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] % 2 == 0 && array[i] != 0) {
                    arrayEven[k] = array[i];
                    k++;
                }
            }
            System.out.println(Arrays.toString(arrayEven));
        }


    }
}
