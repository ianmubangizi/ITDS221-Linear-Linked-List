package com.mubangizi.list;

import com.mubangizi.node.Node;

/**
 *
 * @author Ian Mubangizi
 * @param <E>
 */
public interface LinearLinkedList<E> {
    int count();

    Node<E>[] elements();

    void add(E element);
}
