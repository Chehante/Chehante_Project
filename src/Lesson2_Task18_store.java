public class Lesson2_Task18_store {
    public static void main(String[] args){
        int amount = 0;
        for (int i = 0; i<=50000; i++){
            boolean contains = Integer.toString(i).indexOf("2") != -1;
            if (contains)
                amount += 1;
        }
        System.out.print("Стоит перепечатать " + amount + " табличек");
    }
}
