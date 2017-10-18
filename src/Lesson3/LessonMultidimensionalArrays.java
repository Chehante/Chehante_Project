package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class LessonMultidimensionalArrays {
    public static void main(String[] args) {

        /////multidimensionalArrays_Task1_5columns_8raws/////
        multidimensionalarraysTask1();

    }

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


}
