package cn.knife.ds.test;

import cn.knife.ds.stack.arraystack.ArrayStack;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/11/30 21:14 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class ArrayStackTest {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}