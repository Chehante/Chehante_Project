public class Lesson1_Task2 {
    public static void main(String[] args) {

        int n = 84;
        int sum = 0;

        int[] array = Additional_Helping.getArrayOfNumeralsOfNumber(n);
        for (int k : array) {
            sum = sum + k;
        }


        System.out.println("Сумма цифр двухзначного числа n: " + sum);

    }

}
