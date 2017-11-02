package HomeWork.Lesson4.LinkedList;

import java.util.Random;

public class IntList {

    Item lastItem;
    Item head;

    private void add(int i) {

        Item newItem = new Item(i);

        if (head == null) {
            head = newItem;
            lastItem = newItem;
        }
        else {
            Item previousItem = null;
            Item currentItem = head;

            while (currentItem != null) {
                if (currentItem.number > i) {
                    if (currentItem != head) {
                        previousItem.nextItem = newItem;
                        newItem.nextItem = currentItem;
                    }
                    else {
                        head = newItem;
                        newItem.nextItem = currentItem;
                    }
                    return;
                }
                previousItem = currentItem;
                currentItem = currentItem.nextItem;
            }
            previousItem.nextItem = newItem;
            lastItem = newItem;
        }

    }

    private int get(int index){
        Item foundItem = head;
        for (int i = 0; i < index; i++){
            foundItem = foundItem.nextItem;
        }
        return foundItem.number;
    }

    private int remove(int index) {

        if (index == 0) {
            if (head != null) {
            int number = head.number;
            head = head.nextItem;
            return number;}
            else
                System.out.println("Индекс за пределами связанного списка");
                return -1;
        }

        Item previousItem = null;
        Item nextItem = head;
        int number = 0;

        for (int i = 0; i < index; i++) {
            if (nextItem.nextItem != null) {
                previousItem = nextItem;
                nextItem = nextItem.nextItem;
                number = nextItem.number;
            }
            else {
                System.out.println("Индекс за пределами связанного списка");
                return -1;
            }
        }
        previousItem.nextItem = nextItem.nextItem;
        if (previousItem.nextItem == null)
            lastItem = previousItem;
        return number;

    }

    public static void main(String[] args){
        IntList intl = new IntList();

        Random rnd = new Random();
        for (int i = 0; i < 5; i++){
                intl.add(rnd.nextInt(10));
        }
        intl.printIntList();

        System.out.println("Удалили индекс 0, номер: " + intl.remove(0));

        intl.printIntList();

        System.out.println("Удалили индекс 3, номер: " + intl.remove(3));

        intl.printIntList();

    }


///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    public void printIntList(){
        Item nextItem = head;
        while (nextItem != null) {
            System.out.print(nextItem.number + " ");
            nextItem = nextItem.nextItem;
        }
        System.out.println();

    }
}
