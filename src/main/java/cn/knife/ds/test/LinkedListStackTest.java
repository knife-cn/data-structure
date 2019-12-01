package cn.knife.ds.test;

import cn.knife.ds.stack.linkedliststack.LinkedListStack;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/12/1 13:52 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class LinkedListStackTest {

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}