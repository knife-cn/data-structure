package cn.knife.ds.queue;

/**
 * description:  package cn.knife.ds.queue; <br>
 * date: 2019/11/30 21:57 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
