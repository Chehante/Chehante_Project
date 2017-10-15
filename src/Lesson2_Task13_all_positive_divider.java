import java.util.Scanner;

public class Lesson2_Task13_all_positive_divider {
    public static void main(String[] args){

        System.out.println("Введите натуральное число:");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        System.out.println("Массив положительных делителей:");

        for (int k = 1; k<n; k++ ){
            if (n%k == 0)
                System.out.println(k);
        }


    }
}
