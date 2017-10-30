package Lesson7.Iterator;

import Lesson8.Clone;

public interface List extends Iterable{
    public void add(Object object);

    public Object get(int Index);

    public Object remove(int Index);

    public int size();

    public List clone();
}
