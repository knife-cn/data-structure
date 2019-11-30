package cn.knife.ds.test;

import cn.knife.ds.queue.Queue;
import cn.knife.ds.queue.arrayqueue.ArrayQueue;
import cn.knife.ds.queue.loopqueue.LoopQueue;

import java.util.Random;

/**
 * description:  数组队列和循环队列时间复杂度比较 <br>
 * date: 2019/11/30 22:48 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class QueueCompareTest {
    /**
     * 测试运行opCount个enqueue和dequeue操作所需要的时间，单位：秒
     *
     * @param q
     * @param opCount
     * @return
     */
    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue, time: " + time2 + " s");
    }
}