package cn.knife.ds.test;

import cn.knife.ds.queue.linkedlistqueue.LinkedListQueue;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/12/1 20:43 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class LinkedListQueueTest {

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
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