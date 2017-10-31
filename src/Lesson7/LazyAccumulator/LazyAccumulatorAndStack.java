package Lesson7.LazyAccumulator;

import Lesson5.Accumulator.Operation;
import Lesson7.Iterator.LinkedList.LinkedList;
import Lesson7.Iterator.List;
import Lesson7.Iterator.Stack;

import java.util.Iterator;

public class LazyAccumulatorAndStack {

    public int value;
    public List listOfOperationsWithValue;
    public Stack stackOfOperationsWithValue;

    //constructor
    public LazyAccumulatorAndStack(int value, List list, Stack stack){
        listOfOperationsWithValue = list;
        this.value = value;
        stackOfOperationsWithValue = stack;
    }

    //constructor
    public LazyAccumulatorAndStack(int value, Stack stack){
        stackOfOperationsWithValue = stack;
        this.value = value;
    }

    public int calculate(){
        Iterator itr = listOfOperationsWithValue.iterator();
        while (itr.hasNext()){
            OperationWithValue operWithValue = (OperationWithValue) itr.next();
            value = operWithValue.oper.doOperation(value, operWithValue.value);
        }

        return value;
    }

    public int calculateStack(){

        OperationWithValue operWithValue = (OperationWithValue) stackOfOperationsWithValue.pop();

        Stack auxiliaryStack = new LinkedList();

        while (operWithValue != null) {
            auxiliaryStack.push(operWithValue);
            operWithValue = (OperationWithValue) stackOfOperationsWithValue.pop();
        }


        OperationWithValue operauxiliaryWithValue = (OperationWithValue) auxiliaryStack.pop();
        while (operauxiliaryWithValue != null) {
            value = operauxiliaryWithValue.oper.doOperation(value, operauxiliaryWithValue.value);
            operauxiliaryWithValue = (OperationWithValue) auxiliaryStack.pop();
        }

        return value;
    }

    public void add(int a, Operation oper){
        Object o = new OperationWithValue(a, oper);
        listOfOperationsWithValue.add(o);
    }

    public void addInStack(int a, Operation oper){
        Object o = new OperationWithValue(a, oper);
        stackOfOperationsWithValue.push(o);
    }

    public static class OperationWithValue{

        public int value;
        Operation oper;

        //constructor
        public OperationWithValue(int value, Operation oper){
            this.value = value;
            this.oper = oper;
        }

    }

    public static void main(String[] args){
        LazyAccumulatorAndStack lzAcc = new LazyAccumulatorAndStack(0, new LinkedList(), new LinkedList());

        //for List
        lzAcc.add(4, new Operation(){
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            };});

        lzAcc.add(1, new Operation(){
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            };});

        //for Stack
        lzAcc.addInStack(5, new Operation(){
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            };});

        lzAcc.addInStack(3, new Operation(){
            @Override
            public int doOperation(int a, int b) {
                return a / b;
            };});

        lzAcc.value = lzAcc.calculate();

        lzAcc.value = lzAcc.calculateStack();

        System.out.println("0 plus 4 minus 1 multiply on 5 divide on 3 == " + lzAcc.value);
    }

}
