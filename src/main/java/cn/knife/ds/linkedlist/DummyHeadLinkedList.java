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
    }

    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 获得链表的第index个位置上的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        Node<E> cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取链表的第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取链表的最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 修改链表的第index个位置上的元素为e
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 查找链表中是否含有元素e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除链表的第index个位置上的元素为，返回删除的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Illegal index.");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    /**
     * 从链表中删除第一个元素，返回删除的元素
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从链表中删除最后一个元素，返回删除的元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
//        Node cur = dummyHead.next;
//        while (cur != null) {
//            res.append(cur + "->");
//            cur = cur.next;
//        }
        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }
        res.append("NULL");
        return res.toString();
    }
}