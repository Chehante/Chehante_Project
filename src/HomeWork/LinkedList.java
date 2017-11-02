package HomeWork;

import java.util.Arrays;
import java.util.Iterator;

public class LinkedList <T> implements List<T>, Queue<T>, Stack<T> {

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

    public T remove(int index) {

        if (index == 0) {
            if (head != null) {
            T ob = (T)head.object;
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
                return null;
            }
        }
        previousItem.nextItem = nextItem.nextItem;
        if (previousItem.nextItem == null)
            lastItem = previousItem;
        return (T)ob;

    }

    public static void main(String[] args){
        List <String> intl = new LinkedList<>();

        intl.add("Опа");
        intl.add("гагнам");
        intl.add("стайл");

        Iterator itr = intl.iterator();
        //пробегаем с помощью итератора по ArrayList
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.print(o + " ");
        }

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
        if (head == null)
            return null;
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

    @Override
    public Iterator iterator() {
        return new IteratorInner(head);
    }

    //внутренний класс
    public class IteratorInner implements Iterator{

        Item currentItem;

        public IteratorInner (Item firstItem){
            currentItem = firstItem;
        }

        @Override
        public boolean hasNext() {
            if (currentItem == null)
                return false;
            else
                return true;
        }

        @Override
        public Object next() {
            Item t = currentItem;
            currentItem = t.nextItem;
            return t.object;
        }
    }

    @Override
    public List clone() {
        LinkedList lnkdList = new LinkedList();
        lnkdList.head = head;
        return lnkdList;
    }
///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    public void printList(){
        Item nextItem = head;
        while (nextItem != null) {
            System.out.print(nextItem.object.toString() + " ");
            nextItem = nextItem.nextItem;
        }
        System.out.println();

    }
}
