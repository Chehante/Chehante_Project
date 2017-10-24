package Lesson6.ArrayList;

import Lesson6.List;
import Lesson6.Queue;
import Lesson6.Stack;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList implements List, Queue, Stack {

    public static int arrayCapacity = 10;
    private Object[] arrayObjects;
    private int previousLength = 10;

    @Override
    public void add(Object object) {
        int arrSize = size();
        if (arrSize == arrayObjects.length){
            Object[] arrayObjectsNew = new Object[arrSize * 3 / 2 + 1];
            for (int i = 0; i < arrSize; i++) {
                arrayObjectsNew[i] = arrayObjects[i];

            }
            arrayObjectsNew[arrSize] = object;
            previousLength = arrayObjects.length;
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
        int arraySize = size();
        Object[] arrayObjectsNew;
        if (arraySize - 1 == previousLength) {
            arrayObjectsNew = new Object[previousLength];
        }
        else
            //если размерность не меняется, то можно не создавать второй массив, зато код однотипный. спросить.
            arrayObjectsNew = new Object[arrayObjects.length];

        for (int i = 0; i < arraySize; i++) {
            int r = i < index ? i : i + 1;
            arrayObjectsNew[r] = arrayObjects[i];
        }
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
        arrList.arrayObjects[0] = new Integer(6);
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
        previousLength = arrayObjects.length;
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
