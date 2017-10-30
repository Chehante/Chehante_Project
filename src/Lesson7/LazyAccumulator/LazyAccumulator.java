package Lesson7.LazyAccumulator;

import Lesson5.Accumulator.Operation;
import Lesson7.Iterator.LinkedList.LinkedList;
import Lesson7.Iterator.List;

import java.util.Iterator;

public class LazyAccumulator {

    public List listOfOperationsWithValue;

    //constructor
    public LazyAccumulator(List list){
        listOfOperationsWithValue = list;
    }

    public int calculate(){
        Iterator itr = listOfOperationsWithValue.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
        }

        return 2;
    }

    public void add(int a, Operation oper){
        Object o = new OperationWithValue(a, oper);
        listOfOperationsWithValue.add(o);
    }

    public static class OperationWithValue{

        int value;
        Operation oper;

        //constructor
        public OperationWithValue(int value, Operation oper){
            this.value = value;
            this.oper = oper;
        }

    }

    public static void main(String[] args){
        LazyAccumulator lzAcc = new LazyAccumulator(new LinkedList());
        lzAcc.add(4, new Operation(){
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            };});
        System.out.println(lzAcc.calculate());
    }

}
