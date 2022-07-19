package chapter3;

import java.util.Iterator;

/**
 * @author Mr.Xiao
 * @date 2022/07/22 22:21
 * @Contain LinkedList类的实现
 **/
@SuppressWarnings("all")
public class MyLinkedList<Object> implements Iterable<Object>{

    private int theSize;
    private int modCount = 0;
    private Node<Object> beginMarker;
    private Node<Object> endMarker;

    private static class Node<Object> {
        public Node(Object d, Node<Object> p, Node<Object> n) {
            data = d;
            prev = p;
            next = n;
        }
        public Object data;
        public Node<Object> prev;
        public Node<Object> next;
    }

    public MyLinkedList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(Object x) {
        add(size(), x);
    }

    public void add(int idx, Object x) {
        addBefore(getNode(idx, 0, size()), x);
    }

    public Object get(int idx) {
        return getNode(idx).data;
    }

    public Object set(int idx, Object newVal) {
        Node<Object> p = getNode(idx);
        Object oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public Object remove(int idx) {
        return remove(getNode(idx));
    }

    private void addBefore(Node<Object> p, Object x) {
        Node<Object> newNode = new Node<>(x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    private Object remove(Node<Object> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;
        return p.data;
    }

    private Node<Object> getNode(int idx) {
        return getNode(idx, 0, size() - 1);
    }

    private Node<Object> getNode(int idx, int lower, int upper) {
        Node<Object> p;

        if (idx < lower || idx > upper) {
            throw new IndexOutOfBoundsException();
        }

        if (idx < size() / 2) {
            p = beginMarker.next;
            for (int i = 0; i < idx; i++) {
                p = p.next;
            }
        } else {
            p = endMarker;
            for (int i = size(); i > idx; i--) {
                p = p.prev;
            }
        }
        return p;
    }

    private void doClear() {
        beginMarker = new Node<>(null, null, null);
        endMarker = new Node<>(null, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
        modCount++;
    }

//    private class LikedListIterator implements Iterable<Object> {
//
//    }
    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
