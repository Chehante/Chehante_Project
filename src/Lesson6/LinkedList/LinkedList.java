package Lesson6.LinkedList;

import Lesson6.List;
import Lesson6.Queue;
import Lesson6.Stack;

import java.awt.*;

public class LinkedList implements List , Queue,  Stack{

    Item lastItem;
    Item head;

    public void add(Object object) {

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

    public Object get(int index){
        Item foundItem = head;
        for (int i = 0; i < index; i++){
            foundItem = foundItem.nextItem;
        }
        return foundItem.object;
    }

    public Object remove(int index) {

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
        LinkedList intl = new LinkedList();

        intl.add(new Integer(3));
        intl.add(new Integer(4));
        intl.add(new Integer(8));
        intl.add(new Integer(1));

        intl.printLinkedList();

        System.out.println("Удалили индекс 1, номер: " + intl.remove(1));

        intl.printLinkedList();

        System.out.println("Индекс 1 теперь: " + intl.get(1));

        intl.push(new Integer(2));

        intl.printLinkedList();

        intl.pop();

        intl.poll();

        intl.printLinkedList();

        System.out.println("Размер массива: " + intl.size());

    }

    public int size(){
        if (head == null)
            return 0;
        else {
            int size = 1;
            Item currentItem = head;
            while (currentItem.nextItem != null)
                currentItem = currentItem.nextItem;
                size++;
            return size;
        }
    }

    //from the beginning
    public Object poll(){
        Item currentItem = head;
        head = head.nextItem;
        return currentItem.object;
    }

    //to the beginning
    public void push(Object object){
        Item itm = new Item(object);
        itm.nextItem = head;
        head = itm;
    }

    //from the beginning
    public Object pop(){
        return poll();
    }

///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    private void printLinkedList(){
        Item nextItem = head;
        while (nextItem != null) {
            System.out.print(nextItem.object.toString() + " ");
            nextItem = nextItem.nextItem;
        }
        System.out.println();

    }
}
