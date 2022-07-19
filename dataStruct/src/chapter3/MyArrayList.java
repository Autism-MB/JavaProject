package chapter3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Mr.Xiao
 * @date 2022/07/18 20:54
 * @Contain ArrayList类的实现
 **/
@SuppressWarnings("all")
public class MyArrayList<Int> implements Iterable<Int> {

    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private Int[] theItems;

    public MyArrayList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void trimToSize() {
        ensureCapacity(size());
    }

    public Int get(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[idx];
    }

    public Int set(int idx, Int newVal) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Int old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }

    //收缩数组
    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) {
            return;
        }

        Int[] old = theItems;
        theItems = (Int []) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            theItems[i] = old[i];
        }
    }

    public boolean add(Int x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, Int x) {
        if (theItems.length == size()) {
            ensureCapacity(size() * 2 + 1);
        }
        for (int i = theSize; i > idx; i--) {
            theItems[i] = theItems[i - 1];
        }
        theItems[idx] = x;
        theSize++;
    }

    public Int remove(int idx) {
        Int removedItem = theItems[idx];
        for (int i = idx; i < size() - 1; i++) {
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return removedItem;
    }

    @Override
    public Iterator<Int> iterator() {
        return (Iterator<Int>) new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterable<Int> {

        private int current = 0;

        public boolean hasNext() {
            return current < size();
        }

        public Int next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return theItems[current++];
        }

        public void remove() {
            MyArrayList.this.remove(--current);
        }

        @Override
        public Iterator<Int> iterator() {
            return null;
        }
    }
}
