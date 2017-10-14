import java.util.Scanner;

public class Lesson2_Task3_roots_of_quadratic_equation {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число \"a\"");
        double a = scan.nextDouble();
        System.out.println("Введите число \"b\"");
        double b = scan.nextDouble();
        System.out.println("Введите число \"c\"");
        double c = scan.nextDouble();

        double sqr1 = (-b+Math.sqrt(b*b - 4*a*c))/2*a;
        double sqr2 = (-b-Math.sqrt(b*b - 4*a*c))/2*a;

        if (sqr1 == sqr2)
            System.out.println("Корень квадратного уравнения: " + sqr1);
        else
            System.out.println("Корни квадратного уравнения: " + sqr1 + " ; " + sqr2);
    }

}
