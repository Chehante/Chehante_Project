import java.util.Scanner;

public class Lesson2_Task14_simple_number {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите натуральное число для проверки:");
        int number = scr.nextInt();
        boolean simple = true;
        for (int k = 2; k<=Math.floor(Math.sqrt(number));k++) {
            if (number%k == 0) {
                simple = false;
                break;
            }
        }
        System.out.println("Это " + (simple ? "" : "не ") + "простое число");
    }
}
