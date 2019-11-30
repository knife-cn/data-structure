package cn.knife.ds.linkedlist;

/**
 * description:  链表结点 <br>
 * date: 2019/12/1 0:38 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class Node<E> {

    E e;
    Node next;

    public Node(E e, Node next) {
        this.e = e;
        this.next = next;
    }

    public Node(E e) {
        this(e, null);
    }

    public Node() {
        this(null, null);
    }

    @Override
    public String toString() {
        return e.toString();
    }
}