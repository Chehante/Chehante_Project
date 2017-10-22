package Lesson5.LinkedList;

import Lesson4.LibraryBooks.Book;
import Lesson4.LibraryBooks.Library;
import Lesson5.Geometry.Point;

import java.util.Random;

public class IntList {

    Item lastItem;
    Item head;

    private void add(Object object) {

        Item newItem = new Item(object);

        if (head == null) {
            head = newItem;
            lastItem = newItem;
        }
        else {
            lastItem.nextItem = newItem;
            lastItem = newItem;
        }

    }

    private Object get(int index){
        Item foundItem = head;
        for (int i = 0; i < index; i++){
            foundItem = foundItem.nextItem;
        }
        return foundItem.object;
    }

    private Object remove(int index) {

        if (index == 0) {
            if (head != null) {
            Object ob = head.object;
            head = head.nextItem;
            return ob;}
            else
                System.out.println("Индекс за пределами связанного списка");
                return null;
        }

        Item previousItem = null;
        Item nextItem = head;
        Object ob = null;

        for (int i = 0; i < index; i++) {
            if (nextItem.nextItem != null) {
                previousItem = nextItem;
                nextItem = nextItem.nextItem;
                ob = nextItem.object;
            }
            else {
                System.out.println("Индекс за пределами связанного списка");
                return -1;
            }
        }
        previousItem.nextItem = nextItem.nextItem;
        if (previousItem.nextItem == null)
            lastItem = previousItem;
        return ob;

    }

    public static void main(String[] args){
        IntList intl = new IntList();

        Object rctngl = new Point(4,5);
        intl.add(rctngl);

        Object book = new Book("author", "title", 10);
        intl.add(book);

        Object lbr = new Library();
        intl.add(lbr);

        intl.printIntList();

        System.out.println("Удалили индекс 0, номер: " + intl.remove(0));

        intl.printIntList();

        System.out.println("Удалили индекс 1, номер: " + intl.remove(1));

        intl.printIntList();

    }


///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    private void printIntList(){
        Item nextItem = head;
        while (nextItem != null) {
            System.out.print(nextItem.object.toString() + " ");
            nextItem = nextItem.nextItem;
        }
        System.out.println();

    }
}
