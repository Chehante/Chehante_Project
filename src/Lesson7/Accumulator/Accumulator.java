package Lesson7.Accumulator;

import java.util.Random;

public class Accumulator {

    int value;
    Operation oper;

    //constructor
    public Accumulator(int x) {
        value = x;
    }

    public static void main(String[] args) {

        int x = 0;
        Random rndm = new Random();

        Accumulator acc = new Accumulator(0);

        Operation opPlus = new Operation() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Operation opMinus = new Operation() {
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            }
        };

        Operation opMultiply = new Operation() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        Operation opDivide = new Operation() {
            @Override
            public int doOperation(int a, int b) {
                return a / b;
            }
        };

        acc.oper = opPlus;
        acc.accumulate(7);

        System.out.println("Basic value is 0, plus 7 and get: " + acc.getValue());

        acc.oper = opMinus;
        acc.accumulate(2);

        System.out.println("Current value is 7, plus 2 and get: " + acc.getValue());

        acc.oper = opMultiply;
        acc.accumulate(4);

        System.out.println("Current value is 5, multiply on 4 and get: " + acc.getValue());

        acc.oper = opDivide;
        acc.accumulate(2);

        System.out.println("Current value is 20, divide on 2 and get: " + acc.getValue());
    }

    public void accumulate(int a){
        value = oper.doOperation(value, a);
    }

    public int getValue(){
        return value;
    }


}
