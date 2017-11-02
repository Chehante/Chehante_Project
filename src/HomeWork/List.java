package HomeWork;

public interface List <T> extends Iterable{
    public void add(T object);

    public <T> T get(int Index);

    public <T> T remove(int Index);

    public int size();

    public List clone();
}
