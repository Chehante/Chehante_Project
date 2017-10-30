package Lesson8;

import Lesson7.Iterator.ArrayList.ArrayList;
import Lesson7.Iterator.LinkedList.LinkedList;
import Lesson7.Iterator.List;
import Lesson7.Utils.Utils;

import java.util.Arrays;

public class Clone {

    public static void main(String[] args){
        LinkedList linkedList = Utils.makeBasicLinkedList();
        ArrayList arrayList = Utils.makeBasicArrList();

        LinkedList clonedLinkedList = (LinkedList) linkedList.clone();
        clonedLinkedList.printList();
        System.out.println(linkedList == clonedLinkedList);

        ArrayList clonedArrayList = (ArrayList) arrayList.clone();
        System.out.println(Arrays.toString(clonedArrayList.arrayObjects));
        System.out.println(arrayList == clonedArrayList);
    }
}
