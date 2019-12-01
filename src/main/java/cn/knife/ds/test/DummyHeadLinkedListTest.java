package cn.knife.ds.test;

import cn.knife.ds.linkedlist.DummyHeadLinkedList;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/12/1 8:39 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class DummyHeadLinkedListTest {

    public static void main(String[] args) {
        DummyHeadLinkedList<Integer> linkedList = new DummyHeadLinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}