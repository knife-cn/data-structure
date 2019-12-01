package cn.knife.ds.linkedlist;

/**
 * description:  拥有虚拟头结点的链表 <br>
 * date: 2019/12/1 0:37 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class DummyHeadLinkedList<E> {
    private Node dummyHead;
    private int size;

    public DummyHeadLinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 返回链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 在链表index位置添加新的元素e
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    /**
     * 在链表头添加新的元素e
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }

}