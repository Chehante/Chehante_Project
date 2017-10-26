package Lesson7.Iterator;

public interface List extends Iterable{
    public void add(Object object);

    public Object get(int Index);

    public Object remove(int Index);

    public int size();
}
