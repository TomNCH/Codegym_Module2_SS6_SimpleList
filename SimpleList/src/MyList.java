import java.util.Arrays;

public class MyList<Integer> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void EnsureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(Integer e){
        if (size == elements.length){
            EnsureCapa();
        }
        elements[size++] = e;
    }

    public Integer get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (Integer) elements[i];
    }
}
