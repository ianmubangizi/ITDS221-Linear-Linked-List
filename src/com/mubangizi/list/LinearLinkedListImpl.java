package com.mubangizi.list;

import com.mubangizi.node.NodeImpl;
import com.mubangizi.node.Node;

public class LinearLinkedListImpl<E extends Object> implements LinearLinkedList<E> {

    private int size;
    private Node root;
    private Node<E>[] nodes;

    public LinearLinkedListImpl() {
        this.size = 0;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public Node<E>[] elements() {
        return nodes;
    }

    @Override
    public void add(E element) {
        Node newNode = new NodeImpl(element);
        if (root == null) {
            root = newNode;
        } else {
            root.next(newNode);
        }
        addNode(newNode);
        size++;
    }

    private void addNode(Node<E> newNode) {
        Node<E>[] tmp = new NodeImpl[size + 1];
        if (nodes == null) {
            tmp[size] = newNode;
        } else {
            System.arraycopy(nodes, 0, tmp, 1, nodes.length);
            tmp[0] = newNode;
        }
        nodes = tmp;
    }
}
