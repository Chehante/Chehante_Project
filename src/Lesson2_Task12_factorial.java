import java.util.Scanner;

public class Lesson2_Task12_factorial {
    public static void main(String[] args){

        System.out.println("Введите натуральное число:");
        Scanner scr = new Scanner(System.in);
        int factorial = scr.nextInt();

        int m = 1;
        for (int i = 1; i<=factorial; i++ ){
            m = m*i;
        }
        System.out.println("Факториал числа " + factorial + "-" + m);


    }
}
