package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LessonMultidimensionalArrays {
    public static void main(String[] args) {

        /////multidimensionalArrays_Task1_5columns_8raws/////
        //multidimensionalarraysTask1();

        /////multidimensionalArrays_Task2_8columns_5raws/////
        //multidimensionalarraysTask2();

        /////multidimensionalArrays_Task3_4columns_7raws/////
        //multidimensionalarraysTask3();

        /////multidimensionalArrays_Task4_max_value_on_first_place/////
        //multidimensionalarraysTask4();

        /////multidimensionalArrays_Task5_lesson_of_mathimatics/////
        multidimensionalarraysTask5();

    }
    /////multidimensionalArrays_Task1_5columns_8raws/////
    public static void multidimensionalarraysTask1(){
        Random rndm = new Random();
        int[][] multiarray = new int[8][5];
        for (int i = 0; i < multiarray.length; i++) {
            for (int y = 0; y < multiarray[i].length; y++) {
                multiarray[i][y] = 10 + rndm.nextInt(90);
                System.out.print(multiarray[i][y]+ " ");
            }
            System.out.println("");
        }
        Arrays.toString(multiarray);
    }

    public static void multidimensionalarraysTask2(){
        Random rndm = new Random();
        int max = -99;
        int[][] multiarray = new int[5][8];
        for (int i = 0; i < multiarray.length; i++) {
            for (int y = 0; y < multiarray[i].length; y++) {
                multiarray[i][y] = -99 + rndm.nextInt(199);
                System.out.print(multiarray[i][y]+ " ");
                if (multiarray[i][y] > max)
                    max = multiarray[i][y];
            }
            System.out.println("");
        }
        System.out.println("Наибольший элемент двумерного массива: " + max);
    }

    public static void multidimensionalarraysTask3(){
        Random rndm = new Random();
        int[] valuesOfProduction = new int[]{1,1,1,1,1,1,1};
        int[][] multiarray = new int[7][4];
        int indexmax = 0;
        for (int i = 0; i < multiarray.length; i++){
            for (int y = 0; y < multiarray[i].length; y++){
                multiarray[i][y] = -5 + rndm.nextInt(11);
                valuesOfProduction[i] *= Math.abs(multiarray[i][y]);
                System.out.print(multiarray[i][y] + " ");
            }
            System.out.println("");
        }
        for (int k = 0; k < valuesOfProduction.length; k++) {
            if (valuesOfProduction[k] > valuesOfProduction[indexmax])
                indexmax = k;
        }
        System.out.println("Максимальное произведение содержится в индексе: " + indexmax + " и равно " + valuesOfProduction[indexmax] + " по модулю");
    }

    public static void multidimensionalarraysTask4(){
        Random rndm = new Random();
        Integer[][] multiarray = new Integer[6][7];
        for (int i = 0; i < multiarray.length; i++) {
            for (int y = 0; y < multiarray[i].length; y++) {
                multiarray[i][y] = rndm.nextInt(9);
                System.out.print(multiarray[i][y]+ " ");
            }
            System.out.println("");
        }

        for (int m = 0; m < multiarray.length; m++){
            Arrays.sort(multiarray[m], Collections.reverseOrder());
            System.out.println(Arrays.toString(multiarray[m]));
        }

    }

    public static void multidimensionalarraysTask5(){
        Random rndm = new Random();
        Integer[][] multiarray = new Integer[2][15];
        String cheking = "";
        for (int i = 0; i < 15; i++) {
            int a = 0;
            int b = 0;
            while ((a == 0 && b == 0) && (cheking.indexOf(a + "*" + b) != -1 || cheking.indexOf(b + "*" + a) != -1)){
                a = rndm.nextInt(9);
                b = rndm.nextInt(9);
            }
            multiarray[0][i] = a;
            multiarray[1][i] = b;
            cheking = cheking + a + "*" + b;
            }

        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(multiarray[i]));
        }
    }


}
