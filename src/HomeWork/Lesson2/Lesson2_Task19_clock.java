package HomeWork.Lesson2;

public class Lesson2_Task19_clock {
    public static void main(String[] args){

        int amount = 0;
        cont:
        for (int i = 0; i<2; i++){
            for (int j = 0; j<9; j++){
                if (i == 2 && j > 4)
                    break cont;
                for (int k = 0; k<10; k++){
                    for (int l = 0; l<10; l++){
                        if (l==i && k==j)
                        amount += 1;
                    }
                }
            }

        }
        System.out.print("Зеркалирование за сутки встречается " + amount + " раз");

    }
}
