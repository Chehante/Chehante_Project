import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Lesson2_Task5_random_numbers {
    public static void main(String[] args){
        // Инициализируем генератор
        Random rndm = new Random();
        // Получаем случайное число в диапазоне от 0 до 999 (включительно)
        int number = rndm.nextInt(1000);

        System.out.println(number);

        int[] arrayofint = Additional_Helping.getArrayOfNumeralsOfNumber(number);

        int maxIndex = 0;
        for (int k = 1; k < arrayofint.length; k++) {
            if (arrayofint[k] > arrayofint[maxIndex]){
                maxIndex = k;
            }
        }

        System.out.println("Наибольшая цифра в случайно сгенерированном числе " + number + " : " + arrayofint[maxIndex]);

    }

}
