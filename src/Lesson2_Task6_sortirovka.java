import java.util.Scanner;

public class Lesson2_Task6_sortirovka {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scr.nextInt();
        System.out.println("Введите число b");
        int b = scr.nextInt();
        System.out.println("Введите число c");
        int c = scr.nextInt();

        int[] intarray = new int[]{a,b,c};

        //bubblesort
        for (int i = intarray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intarray[j] > intarray[j + 1]) {
                    int t = intarray[j];
                    intarray[j] = intarray[j + 1];
                    intarray[j + 1] = t;
                }
            }
        }
        for (int number :
             intarray) {
            System.out.println(number);
        }

    }
}
