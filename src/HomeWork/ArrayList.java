package HomeWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayList implements List, Queue, Stack {

    public static int arrayCapacity = 10;
    public Object[] arrayObjects;

    @Override
    public void add(Object object) {
        int arrSize = size();
        if (arrSize == arrayObjects.length){
            Object[] arrayObjectsNew = new Object[arrSize * 3 / 2 + 1];
            for (int i = 0; i < arrSize; i++) {
                arrayObjectsNew[i] = arrayObjects[i];

            }
            arrayObjectsNew[arrSize] = object;
            arrayObjects = arrayObjectsNew;
        }
        else{
            arrayObjects[arrSize] = object;
        }
    }

    @Override
    public Object get(int Index) {
        return arrayObjects[Index];
    }

    @Override
    public Object remove(int index) {
        Object[] arrayObjectsNew = new Object[arrayObjects.length];
        System.arraycopy(arrayObjects, 0, arrayObjectsNew, 0 , index);
        System.arraycopy(arrayObjects, index + 1, arrayObjectsNew, index , arrayObjects.length - index - 1);
        Object t = arrayObjects[index];
        arrayObjects = arrayObjectsNew;
        return t;
    }

    //constructor
    public ArrayList(Object[] arr){
        arrayObjects = arr;
    }


    public static void main(String[] args){
        Random rndm = new Random();
        ArrayList arrList = new ArrayList(new Object[arrayCapacity]);
        //создаем объект вложенного класса итератор
        Iterator itr = arrList.iterator();

        for (int i = 0; i < 6; i++) {
            arrList.add(rndm.nextInt(10));
        }

        System.out.println(Arrays.toString(arrList.arrayObjects));

        //пробегаем с помощью итератора по ArrayList
        while (itr.hasNext()) {
            Object o = itr.next();

            System.out.print(o + " ");
        }
    }

    @Override
    public int size(){
        for (int i = 0; i < arrayObjects.length; i++) {
            if (arrayObjects[i] == null)
                return i;

        }
        return arrayObjects.length;
    }

    //from the beginning
    @Override
    public Object poll(){
        return remove(0);
    }

    //to the beginning
    @Override
    public void push(Object object){
        int arrSize = size();
        Object[] arrayObjectsNew;
        if (arrSize == arrayObjects.length) {
            arrayObjectsNew = new Object[arrSize * 3 / 2 + 1];
        }
        else {
            arrayObjectsNew = new Object[arrayObjects.length];
        }
        arrayObjectsNew[0] = object;
        for (int i = 0; i < arrSize; i++) {
            arrayObjectsNew[i + 1] = arrayObjects[i];
        }
        arrayObjects = arrayObjectsNew;
    }

    //from the beginning
    @Override
    public Object pop(){
        return remove(0);
    }

    @Override
    public Iterator iterator() {
        return new IteratorInner(0);
    }

    @Override
    public List clone() {
        ArrayList arrList = new ArrayList(new Object[arrayObjects.length]);
        arrList.arrayObjects = arrayObjects;
        return arrList;
    }

    //внутренний класс
    public class IteratorInner implements Iterator{

        int currentIndex;

        public IteratorInner (int firstIndex){
            currentIndex = firstIndex;
        }

        @Override
        public boolean hasNext() {return currentIndex < arrayObjects.length && !(arrayObjects[currentIndex] == null);
        }

        @Override
        public Object next() {
            return arrayObjects[currentIndex++];
        }
    }

///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    private void printList() {

    }
}
