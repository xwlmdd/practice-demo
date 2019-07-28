package com.mdd.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreanApiTest {


    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> resultList = list.stream().map(number -> number * number).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }

}
