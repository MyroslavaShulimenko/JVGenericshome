package home1302;


public class HomeClass2<T> {
    private T[] elements;
    private int size;
    private int maxSize;

    public HomeClass2(int maxSize) {
        this.maxSize = maxSize;
        this.elements = (T[]) new Object[maxSize];
        this.size = 0;
    }

    public void addElement(T element) {
        if (size == maxSize) {
            throw new IllegalStateException("The collection is full!");
        } else {
            elements[size] = element;
            size++;
        }
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < size - 1; i++) {  // Shift elements to the left to fill the gap at index.
                // Overwrite the element at index.
                // Reduce size of collection by 1.
                elements[i] = elements[i + 1];
                // Remove reference to the element that was just overwritten.
                elements[i + 1] = null;
            }
            size--;
        }
    }

    public boolean containsElement(T element) {  // Check if the collection contains a given element.
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element))
                return true;
        }
        return false;
    }

    public int countElements() {
        return this.size;
    }

    public void printElements() {
        for (int i = 0; i < size; i++) System.out.println(elements[i]);
    }

    public static void main(String[] args) {
        HomeClass2<Integer> bc = new HomeClass2<>(10);
        bc.addElement(1);
        bc.addElement(2);
        bc.addElement(3);
        bc.printElements();
        System.out.println("Number of elements: " + bc.countElements());
        //              System.out
    }
}