package Lesson2;

import java.util.Scanner;

public class Lesson2_Task4_interval_5_155 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в интервале [5:155]");
        int a = scan.nextInt();
        if (a>=25 && a<=100)
            System.out.println("Число в интервале [25;100]");
        else
            System.out.println("Число не в интервале [25;100]");
    }

}
