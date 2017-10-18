package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class LessonMultidimensionalArrays {
    public static void main(String[] args) {

        /////multidimensionalArrays_Task1_5columns_8raws/////
        //multidimensionalarraysTask1();

        /////multidimensionalArrays_Task2_8columns_5raws/////
        //multidimensionalarraysTask2();

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


}
