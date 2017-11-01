package Lesson7.LibraryBooksHashCode;

import Lesson7.Iterator.LinkedList.Item;
import Lesson7.Iterator.LinkedList.LinkedList;

import java.util.Arrays;
import java.util.Iterator;

public class Library {

    public LinkedList[] arrLinkedList = new LinkedList[6];
    public Iterator[] arrIterator = new Iterator[6];

    //constructor
    public Library(){
        for (int i = 0; i < 6; i++){
            arrIterator[i] = arrLinkedList[i].iterator();
        }
    }

    public void put(Book book, int quantity){

        int index = book.hashCode()%6;
        LinkedList currentLinkedList = arrLinkedList[index];

        if (currentLinkedList.head == null){
            currentLinkedList.head = new Item(new Shelf(book, quantity));
            return;
        }

        while (arrIterator[index].hasNext()) {
            Shelf currentItem = (Shelf) arrIterator[index].next();
            if (currentItem.book.equals(book)){
                currentItem.quantity += quantity;
                return;
            }
        }

        currentLinkedList.add(new Item(new Shelf(book, quantity)));

    }

    public int get(Book book, int quantity) {

        int index = book.hashCode()%6;
        LinkedList currentLinkedList = arrLinkedList[index];

        while (arrIterator[index].hasNext()) {
            Shelf currentItem = (Shelf) arrIterator[index].next();
            if (currentItem.book.equals(book)){
                return Math.min(currentItem.quantity, quantity);
            }
        }

        System.out.println("Полка не найдена");
        return 0;
    }

    public static void main(String[] args){

        int n = 0;

        Library lbrr = new Library();
        Book book1 = new Book("author1", "title1", 100);
        Book book2 = new Book("author2", "title2", 100);
        Book book3 = new Book("author3", "title3", 100);
        Book book4 = new Book("author4", "title4", 100);
        Book book5 = new Book("author5", "title5", 100);
        Book book6 = new Book("author6", "title6", 100);

        lbrr.put(book1, 10);
        n = lbrr.get(book2, 10);
        if (n > 0)
            System.out.println("Взяли из библиотеки " + n + " книг " + book2.author);
        lbrr.put(book2, 20);
        n = lbrr.get(book2, 10);
        if (n > 0)
        System.out.println("Взяли из библиотеки " + n + " книг " + book2.author);
        lbrr.put(book3, 10);
        lbrr.put(book4, 10);
        lbrr.put(book5, 10);
        lbrr.put(book6, 20);
        n = lbrr.get(book6, 10);
        if (n > 0)
            System.out.println("Взяли из библиотеки " + n + " книг " + book6.author);


    }

}
