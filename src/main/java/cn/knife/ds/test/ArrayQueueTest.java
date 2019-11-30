package cn.knife.ds.test;

import cn.knife.ds.queue.arrayqueue.ArrayQueue;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/11/30 22:06 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}