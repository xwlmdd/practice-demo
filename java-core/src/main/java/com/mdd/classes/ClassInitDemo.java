package com.mdd.classes;

/**
 * @version 1.0
 * @Author: xuwanglu
 * @CreateDate: 2018/3/13 12:53
 * @Description:
 */
public class ClassInitDemo {
    private Integer s;
    private static int num;

    static {
        System.out.println(num);
        num = 20;
        int i = 0;
        System.out.println(num);
        System.out.println("hello world!");
    }

    public void printCurrencyclassPath(){
        System.out.println(this.getClass().getClassLoader().getResource(""));
        System.out.println(this.getClass().getClassLoader().getParent());
    }

    public static void main(String[] args) {

        ClassInitDemo classInitDemo = new ClassInitDemo();
        classInitDemo.printCurrencyclassPath();


    }
}
