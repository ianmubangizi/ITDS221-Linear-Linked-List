package com.mubangizi.node;

/**
 *
 * @author Ian Mubangizi
 * @param <E>
 */
public interface Node<E> {

    void next(Node node);

    Node next();

    E getData();
}
