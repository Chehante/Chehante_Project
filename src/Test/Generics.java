package Test;

public class Generics {

    public class Box <T extends Number> {
        //constructot
        public Box(){}

        private T item;

        public T getItem(){
            return item;
        }

        public void setItem(T o){
            item = o;
        }
    }

    public static void main(String[] args){
        Generics gnrc = new Generics();
        Generics.Box<Float> box = gnrc.new Box<Float>();
        Generics.Box<Integer> box2 = gnrc.new Box<Integer>();

        System.out.println(box.getClass().equals(box2.getClass()));
        System.out.println(box.getClass());
        System.out.println(box2.getClass());

        int a =  new Integer(190);
        int b =  new Integer(190);
    }

}
