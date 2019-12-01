package cn.knife.ds.test;

import cn.knife.ds.stack.Stack;
import cn.knife.ds.stack.arraystack.ArrayStack;
import cn.knife.ds.stack.linkedliststack.LinkedListStack;

import java.util.Random;

/**
 * description:  链表栈和数组栈的比较 <br>
 * date: 2019/12/1 13:56 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class StackCompareTest {
    /**
     * 测试使用stack运行opCount个push和pop操作所需时间，单位：秒
     *
     * @param stack
     * @param opCount
     * @return
     */
    private static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack, time: " + time2 + "s");
    }
}