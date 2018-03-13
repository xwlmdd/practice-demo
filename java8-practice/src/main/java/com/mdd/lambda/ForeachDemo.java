package com.mdd.lambda;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @Author: xuwanglu
 * @CreateDate: 2018/2/1 15:49
 * @Description:
 */
@Component
public class ForeachDemo {

    public void foreach(){
        List<String> strList = Arrays.asList("curry", "tom", "pull");
        strList.forEach(str -> {
            if ("curry".equals(str)){
                return;
            }
            System.out.println(str);
        });
    }
}
