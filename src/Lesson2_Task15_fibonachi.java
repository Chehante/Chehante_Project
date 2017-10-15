public class Lesson2_Task15_fibonachi {
    public static void main(String[] args){
        int before = 1;
        int before_before = 1;
        System.out.println(before_before);
        System.out.println(before);
        for (int i = 0; i<9; i++){
            System.out.println(before + before_before);
            int t = before + before_before;
            before_before = before;
            before = t;
        }
    }
}
