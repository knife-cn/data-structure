package cn.knife.ds.stack;

/**
 * description:  package cn.knife.ds.stack; <br>
 * date: 2019/11/30 21:00 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public interface Stack<E> {
    
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
