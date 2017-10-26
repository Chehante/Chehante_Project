package Lesson6.ArrayList;

import Lesson6.List;
import Lesson6.Queue;
import Lesson6.Stack;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList implements List, Queue, Stack {

    public static int arrayCapacity = 10;
    private Object[] arrayObjects;

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
        ArrayList arrList = new ArrayList(new Object[arrayCapacity]);
        arrList.add(new Integer(6));
        arrList.add(new Integer(2));
        arrList.add(new Integer(3));

        System.out.println(Arrays.toString(arrList.arrayObjects));

        System.out.println(arrList.get(2));

        arrList.remove(2);

        System.out.println(Arrays.toString(arrList.arrayObjects));

        System.out.println("Текущий размер массива: " + arrList.size());

        arrList.push(new Integer(8));
        arrList.push(new Integer(9));

        System.out.println(Arrays.toString(arrList.arrayObjects));

        arrList.pop();

        System.out.println(Arrays.toString(arrList.arrayObjects));

        arrList.poll();

        System.out.println(Arrays.toString(arrList.arrayObjects));


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

///////////////////////////extra metods///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////


    private void printLinkedList() {
    }

}
