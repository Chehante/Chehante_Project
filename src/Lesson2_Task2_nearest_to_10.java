import java.util.Scanner;

public class Lesson2_Task2_nearest_to_10 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double n = scan.nextDouble();
        System.out.println("Введите второе число");
        double m = scan.nextDouble();
        double mod_n = Math.abs(10-n);
        double mod_m = Math.abs(10-m);

        if (mod_n < mod_m)
            System.out.println("Первое число ближе к 10");
        else if (mod_n > mod_m)
            System.out.println("Второе число ближе к 10");
        else
            System.out.println("Числа равноудалены от 10");

    }

}
