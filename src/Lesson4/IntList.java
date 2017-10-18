package Lesson4;

import java.util.Random;

public class IntList {

    Item head;

    public static void main(String[] args) {
        Item head = new Item(0);
        IntList basicList = new IntList(head);
        Random rndm = new Random();
        for (int i = 0; i < 5; i++) {
            basicList.add(1 + rndm.nextInt(9));
        }
        basicList.printArray();
        System.out.println("The value of index 3 is " + basicList.get(3).number);
        System.out.println("Are deleting index 3");
        int deleted = basicList.remove(3);
        System.out.println("Deleted number: " + deleted);
        basicList.printArray();
    }

    private IntList(Item firstItem) {
        head = firstItem;
    }

    private void add(int i) {
        Item item = new Item(i);
        getLastItem().nextItem = item;
    }

    private Item get(int index) {
        Item wantedItem = head;
        for (int i = 0; i <= index; i++)
            wantedItem = wantedItem.nextItem;
        return wantedItem;
    }

    private int remove(int index) {
        Item previous = index == 0 ? head : get(index - 1);
        previous.nextItem = get(index).nextItem;
        return get(index).number;

    }

    private Item getLastItem() {
        Item lastItem = head;
        while (lastItem.nextItem != null)
            lastItem = lastItem.nextItem;
        return lastItem;
    }

    private void printArray() {
        Item lastItem = head;
        while (lastItem.nextItem != null) {
            lastItem = lastItem.nextItem;
            System.out.println(lastItem.number);
        }
    }

}
