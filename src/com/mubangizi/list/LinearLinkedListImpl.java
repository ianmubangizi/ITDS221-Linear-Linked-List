package com.mubangizi.list;

import com.mubangizi.node.NodeImpl;
import com.mubangizi.node.Node;

public class LinearLinkedListImpl<E extends Object> implements LinearLinkedList<E> {

    private int size;
    private Node root;

    public LinearLinkedListImpl() {
        this.size = 0;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public E[] elements() {
        return getData((E[]) new Object[size],root, size - 1);
    }

    private E[] getData(E[] array, Node node, int length) {
        if (node != null) {
            array[length--] = (E) node.getData();
            return getData(array, node.next(), length);
        }
        return array;
    }

    @Override
    public void add(E element) {
        Node newNode = new NodeImpl(element);
        if (root == null) {
            root = newNode;
        } else {
            root.next(newNode);
        }
        size++;
    }
}
