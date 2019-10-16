package com.mubangizi.node;

/**
 *
 * @author Ian Mubangizi
 * @param <E>
 */
public class NodeImpl<E> implements Node<E> {

    Node next = null;
    E data;

    public NodeImpl(E data) {
        this.data = data;
    }

    public NodeImpl() {
    }

    @Override
    public String toString() {
        return "NodeImpl{" + "next=" + next + ", data=[" + data + "]}";
    }

    @Override
    public Node next() {
        return next;
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public void next(Node node) {
        if (next == null) {
            next = node;
        } else {
            next.next(node);
        }
    }

}
