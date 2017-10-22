package Lesson5.Accumulator;

import sun.awt.SunHints;

import java.lang.reflect.Array;
import java.util.Random;

public class Accumulator {

    int value;
    Operation oper;

    public static void main(String[] args){

        int x = 0;
        Random rndm = new Random();

        Operation[] arrayOfOperations = new Operation[]{new Plus(), new Multiply(), new Minus(), new Divide()};
        String[] annotations = new String[]{"Added ", "Multiplied on ", "Substracted ", "Diveded on "};

        Accumulator acc = new Accumulator(0, new Plus());
        System.out.println("Made new accumulator with value 0");

        for (int i = 0; i < 4; i++){
            x = 1 + rndm.nextInt(9);
            acc.oper = arrayOfOperations[i];
            acc.accumulate(x);
            System.out.println(annotations[i] + x + " and get: " + acc.getValue());
        }


    }

    //constructor
    public Accumulator(int x, Operation y){
        value = x;
        oper = y;
    }

    public void accumulate(int a){
        value = oper.doOperation(value, a);
    }

    public int getValue(){
        return value;
    }


}
