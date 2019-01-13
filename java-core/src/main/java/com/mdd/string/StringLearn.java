package com.mdd.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringLearn {
    public static void main(String[] args) {
//        hashMapLearn();

//        concurrencyHashMapLearn();
//        System.out.println((5<<3));
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while (i<100){
            list.add(i);
            i++;
        }

        for (int j = 0;j<list.size();j++){
            System.out.println(list.get(j));
            list.remove(j);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Collections.synchronizedList(list);
    }

    private static void concurrencyHashMapLearn() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        concurrentHashMap.put(null,"xwl");
    }

    private static void hashMapLearn() {
        String s = new String();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(null,"xwl");// 在put 检查hashmap是否初始化（懒汉初始化），
        map.put(null,"yzq");// hash(null) = 0,key相同则value会被后存入的覆盖
        System.out.println(map.get(null));
    }
}
