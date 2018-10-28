package com.mdd.spring.tx;

import com.mdd.spring.tx.business.BizService;
import org.junit.Test;

import javax.annotation.Resource;

public class BizServiceTest extends ApplicationTests {

    @Resource
    private BizService bizService;

    @Test
    public void bizServiceTest(){
        bizService.serive();
    }
}
