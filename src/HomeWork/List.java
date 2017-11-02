package HomeWork;

public interface List <T> extends Iterable{
    public void add(T object);

    public T get(int Index);

    public T remove(int Index);

    public int size();

    public List clone();
}
