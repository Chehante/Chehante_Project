import java.util.Scanner;

public class Lesson2_Task1_even_odd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n%2 == 0 ? "Число четное" : "Число нечетное");
    }
}
