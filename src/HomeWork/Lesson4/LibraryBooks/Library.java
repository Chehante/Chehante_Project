package HomeWork.Lesson4.LibraryBooks;

import java.util.Arrays;

public class Library {

    Book[] bookshells = new Book[5];
    int[] bookQuantity = new int[5];

    public void put(Book book, int quantity){
        int index = findIndexOfBook(book);
        if (index < 0)
            System.out.println("Вся библиотека занята, положите книги имеющегося издания");
        else {
            bookshells[index] = book;
            bookQuantity[index] += quantity;
            System.out.println("Положили в библиотек " + quantity + " штук книги: " + book.author);
        }
    }

    public int get(Book book, int quantity) {
        int index = findIndexOfBook(book);
        if (index < 0 || bookshells[index] == null) {
            System.out.println("Выберите другое издание, которое уже есть в библиотеке");
            return 0;
        } else {
            bookQuantity[index] -= Math.min(bookQuantity[index], quantity);
            return Math.min(bookQuantity[index], quantity);

        }
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

        System.out.println(Arrays.toString(lbrr.bookQuantity));


    }

    public int findIndexOfBook(Book b){

        for (int i = 0; i < bookshells.length; i++){
            if (bookshells[i] == b || bookshells[i] == null)
                return i;
        }
        return -1;
    }
}
