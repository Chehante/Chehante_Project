public class Lesson1_Task3 {
    public static void main(String[] args) {

        double w = 4.4;

        //int result = Math.round(w); зачем в явнном виде преобразовывать к инту??
        int result = (int)Math.round(w);
        System.out.println("Результат округения: " + result);

    }
}
