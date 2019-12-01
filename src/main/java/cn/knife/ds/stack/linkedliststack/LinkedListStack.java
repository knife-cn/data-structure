package cn.knife.ds.stack.linkedliststack;

import cn.knife.ds.linkedlist.DummyHeadLinkedList;
import cn.knife.ds.stack.Stack;

/**
 * description:  链表栈 <br>
 * date: 2019/12/1 9:20 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class LinkedListStack<E> implements Stack<E> {

    private DummyHeadLinkedList<E> list;

    public LinkedListStack(){
        list = new DummyHeadLinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }
}