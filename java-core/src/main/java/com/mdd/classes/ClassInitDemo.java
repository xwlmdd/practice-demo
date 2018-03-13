package com.mdd.classes;

/**
 * @version 1.0
 * @Author: xuwanglu
 * @CreateDate: 2018/3/13 12:53
 * @Description:
 */
public class ClassInitDemo {
    private static int num ;

    static {
        System.out.println(num);
        num = 20;
        System.out.println(num);
    }

    public static void main(String[] args) {
        new ClassInitDemo();
    }
}
