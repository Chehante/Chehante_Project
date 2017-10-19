package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class IntList {

    private Item head;

    public static void main(String[] args) {

        int maxIndex;

        Scanner scnr = new Scanner(System.in);
        Random rndm = new Random();

        IntList basicList = new IntList();
        for (int i = 0; i < 5; i++) {
            basicList.add(1 + rndm.nextInt(9));
        }
        maxIndex = basicList.getIndexFromItem(basicList.getLastItem());
        if (maxIndex < 0) {
            System.out.println("В зависимом списке нет ни одного элемента. Дальнейшие действия будут прерваны.");
            return;
        }

        basicList.printArray();

        System.out.println("Введите индекс числа списка (не больше " + maxIndex + "), которое хотите получить:");
        int getexample = scnr.nextInt();
        System.out.println("Значение номера: " + basicList.getItemFromIndex(getexample).number);

        System.out.println("Введите индекс числа списка (не больше " + maxIndex + "), которое удаляем:");
        int deleteexample = scnr.nextInt();
        int deleted = basicList.remove(deleteexample);
        System.out.println("Удален элемент с номером (не индексом): " + deleted);

        basicList.printArray();
    }

    private void add(int i) {
        Item item = new Item(i);
        int finalIndex = 0;
        if (head == null)
            head = item;
        else
            finalIndex = getIndexFromItem(getLastItem());
            for (int k = 0; k <= finalIndex; k++) {
                Item kItem = getItemFromIndex(k);
                if (i < kItem.number){
                    item.nextItem = kItem;
                    if (k == 0)
                        head = item;
                    else
                        getItemFromIndex(k - 1).nextItem = item;
                }
                else if (i > kItem.number && k == getIndexFromItem(getLastItem()))
                getItemFromIndex(k - 1).nextItem = item;
            }

    }

    private int get(int index) {
        return getItemFromIndex(index).number;
    }

    private int remove(int index) {
        if (index == 0)
            head = getItemFromIndex(index + 1);
        else {
            Item previous = getItemFromIndex(index - 1);
            previous.nextItem = getItemFromIndex(index).nextItem;
        }
        return get(index);

    }
///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

    private Item getLastItem() {
        Item lastItem = head;
        if (lastItem == null)
            return null;
        while (lastItem.nextItem != null)
            lastItem = lastItem.nextItem;
        return lastItem;
    }

    private void printArray() {
        //int finalIndex = basicList.getIndexFromItem(basicList.getLastItem());
        for (int i = 0; i < 5; i++)
            System.out.print(getItemFromIndex(i).number + " ");
    }

    private Item getItemFromIndex(int index){
        Item wantedItem = head;
        for (int i = 0; i < index; i++) {
                wantedItem = wantedItem.nextItem;
        }
        return wantedItem;
    }

    private int getIndexFromItem(Item item){
        if (item == null)
            return -1;
        Item nextItem = head;
        int index = 0;
        while (nextItem != item) {
            index += 1;
            nextItem = nextItem.nextItem;
        }
        return index;
    }

}
