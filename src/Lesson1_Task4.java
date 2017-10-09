public class Lesson1_Task4 {
    public static void main(String[] args) {

        int n = 454;

        int q = (n/10)/10 + (n/10)%10 + n%10;

        System.out.println("Сумма цифр трехзначного числа n: " + q);

    }
}