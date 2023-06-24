import java.util.Arrays;
class MyCustomArraylist {

    public static void main(String[] args)
    {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();
    }
}
public class CustomArrayList<E>
{
    private static final int INTIAL_CAPACITY = 5;
    private int size = 0;
    private Object[] elements = {};


    public CustomArrayList() {
        elements = new Object[INTIAL_CAPACITY];
    }

    public void add(E element) {
        if (size == elements.length) {
            increaseCapacity();

        }
        elements[size++] = element;

    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",size" + size);
        }
        return (E) elements[index];

    }

    public Object remove(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",size" + size);
        }
        Object removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        return removedElement;
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }


    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }

    }


}

