public class Lesson2_Task20_army {
    public static void main(String[] args){
        int amount = 0;
        for (int i = 1; i<100000; i++){
            boolean contains = Integer.toString(i).indexOf("4") != -1 || Integer.toString(i).indexOf("13") != -1;
            if (contains)
                amount += 1;
        }
        System.out.print("Придется исключить " + amount + " номеров");
    }
}
