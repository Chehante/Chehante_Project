import java.util.Scanner;

public class Lesson2_Task17_lucky_ticket {
    public static void main(String[] args){

        int quantity = 0;
        for (int i = 1; i<1000; i++){
            for (int j = 1; j<1000; j++){
                int[] array1 = Additional_Helping.getArrayOfNumeralsOfNumber(i);
                int[] array2 = Additional_Helping.getArrayOfNumeralsOfNumber(j);
                if (sumOfIntArray(array1) == sumOfIntArray(array2))
                    quantity += 1;
            }

        }
        System.out.print("Количество счастливых билетов в диапазоне [000001;999999]: " + quantity);
    }

        static int sumOfIntArray(int[] array){
            int sum = 0;
            for (int k:
                    array) {
                sum += k;
            }
            return sum;
        }
}
