package com.mdd.lambda;

import com.mdd.Java8PracticeApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author: xuwanglu
 * @CreateDate: 2018/2/3 16:13
 * @Description:
 */
public class ForeachDemoTest extends Java8PracticeApplicationTests {

    @Resource
    private ForeachDemo foreachDemo;

    @Test
    public void foreachDemoTest(){
        foreachDemo.foreach();
    }

}
