package HomeWork.Lesson2;

import java.util.Random;

public class Lesson2_Task7_hours_till_the_end {
    public static void main(String[] args){
        Random rnd = new Random();
        int seconds = rnd.nextInt(28801);
        int hours = (int)Math.floor(seconds/3600);
        System.out.println(seconds);
        System.out.println("Осталось: " + hours);
    }
}
