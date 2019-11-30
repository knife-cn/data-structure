package cn.knife.ds.test;

import cn.knife.ds.array.Array;

/**
 * description:  package cn.knife.ds.test; <br>
 * date: 2019/11/30 17:55 <br>
 * author: knife <br>
 * version: 1.0 <br>
 */
public class ArrayTest {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(10);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        //[-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        arr.remove(2);
        System.out.println(arr);
        arr.removeElement(4);
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
    }
}