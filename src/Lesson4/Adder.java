package Lesson4;

public class Adder {

    int a;

    public Adder(int aa){
        a = aa;
    }

    public static void main(String[] args){
        Adder adder = new Adder(20);
        System.out.println(adder.a);
        adder.add(20);
        System.out.println(adder.get());
    }

    public void add(int x){
        a += x;
    }

    public int get(){
        return a;
    }

}
