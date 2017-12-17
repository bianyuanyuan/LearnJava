package com.test1;

import java.util.Arrays;

//List
class MyList<E> {
    private int size;// The size of the ArrayList
    private Object elements[];

    MyList(int size) {
        elements = new Object[size];
    }

    public int size() {// Calculate the size of list
        return size;
    }

    public boolean isEmpty() {// judge if the list is empty
        return size == 0;
    }

    public boolean contains(Object o) {// judge if we can find the element
        return indexOf(o) >= 0;
    }

    public boolean add(E e) {// judge if add an element
        elements[size++] = e;
        return true;
    }

    public boolean remove(Object o) {// remove the first element of the
                                     // occurrence of the list
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    remove(i);
                    return true;
                }

            }

        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    remove(i);
                    return true;
                }

            }
        }

        return false;
    }

    void clear() {// remove all of the elements from list
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        MyList other = (MyList) o;
        return true;
    }

    public Object[] toArray() {// Returns an array containing all of the
                               // elements in this list
        return Arrays.copyOf(elements, size);
    }

    @Override
    public int hashCode() {
        final int key = 31;
        int result = 1;
        result = key * result;
        return result;
    }

    private String outOfRange(int index)// Constructs an
                                        // IndexOutOfBoundsException detail
                                        // message
    {
        return "index:" + index + ",size:" + size;
    }

    private void rangeCheck(int index) {// to check the index if out of range
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException(outOfRange(index));
        }

    }

    public E get(int index) {// Returns the element in this list.
        rangeCheck(index);
        return (E) elements[index];
    }

    public E set(int index, E element) {// Replaces the element in this list
        rangeCheck(index);
        E oldVal = get(index);
        elements[index] = element;
        return oldVal;
    }

    public void add(int index, E element) {// add an element in the index
        rangeCheck(index);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {// remove the element
        rangeCheck(index);
        E oldVal = get(index);
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        elements[--size] = null; // clear
        return oldVal;
    }

    int indexOf(Object o) {// Returns the index of the first occurrence of the
                           // element
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(o)) {
                    return i;
                }
            }

        }
        return -1;
    }

    int lastIndexOf(Object o) {// Returns the index of the last occurrence of
                               // the element
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (elements[i].equals(o)) {
                    return i;
                }
            }

        }
        return -1;
    }
}

public class ListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyList<Object> list = new MyList<Object>(6);
        for (int i = 0; i < list.size(); i++) {
            list.add(i,2*i+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
