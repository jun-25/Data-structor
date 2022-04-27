import java.util.Arrays;
import java.util.List;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = null;

    private int size = 0;

    public Object[] arr = null;

    public ArrayList() {
        this.arr = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public ArrayList(int capacity) {
        this.arr = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void resize() {
        int arr_capacity = arr.length;
        if (size == arr_capacity) {
            arr = Arrays.copyOf(arr, arr_capacity * 2);
            return;
        }
        if (size < (arr_capacity / 2))
            arr = Arrays.copyOf(arr, Math.min((arr.length / 2), DEFAULT_CAPACITY));
        return;
    }

    public boolean add(E value) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = value;
        size++;
        return true;
    }

    public void add(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(value);
        } else {
            if (size == arr.length) {
                resize();
            }
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
            size++;
        }
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) arr[index];
    }

    public void set(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            arr[index] = value;
        }
    }

    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public boolean contains(Object value) {
        if (indexOf(value) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public E remove(int index) {


        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E element = (E) arr[index];
        arr[index] = null;

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
            arr[i + 1] = null;
        }
        size--;
        resize();
        return element;
    }

    public boolean remove(Object o) {
        if (indexOf(o) == -1)
            return false;
        remove(indexOf(o));
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
        resize();
    }
}





