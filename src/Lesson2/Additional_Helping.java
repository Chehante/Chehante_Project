package Lesson2;

public class Additional_Helping {

   public static int[] getArrayOfNumeralsOfNumber(int number){

        int numberlength = Integer.toString(number).length();

        int[] arrayOfNumerals = new int[numberlength];

        int i = 0;
        while (number != 0){
            arrayOfNumerals[i++] = number%10;
            number /= 10;
        }

        return arrayOfNumerals;

    }

}
