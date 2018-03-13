package com.mdd.callable_feature;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @version 1.0
 * @Author: xuwanglu
 * @CreateDate: 2018/2/28 10:41
 * @Description:
 */
@Slf4j
public class CallableDemo {
    /**
     * 模拟需求：一个接口里需要调用A、B、C两个方法，并且C方法需要A、B方法的返回结果作为其参数，且两个方法执行时间都比较长。
     * 传统方法：
     * function{
     *     Object a = A();
     *     Object b = B();
     *     C(a,b);
     * }
     * 传统方法看上去也并没有什么效率不高，如果说，还有C、D...等方法，每个方法都依赖前一个方法的返回值，那效率就很差了。
     * 所以，我们可以考虑在A方法执行的同时，B方法也开始执行，
     *
     **/

    public void caculate() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        Callable<Integer> aCallable = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                log.info("开始执行A方法");
                Thread.sleep(5000);
                return 5000;
            }
        };

        Callable<Integer> bCallable = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                log.info("开始执行B方法");
                Thread.sleep(3000);
                return 3000;
            }
        };

        FutureTask<Integer> afutureTask = new FutureTask<Integer>(aCallable);
        FutureTask<Integer> bfutureTask = new FutureTask<Integer>(bCallable);
        threadPoolExecutor.submit(afutureTask);
        threadPoolExecutor.submit(bfutureTask);

        log.info("A方法返回值：{},B方法返回值：{};",afutureTask.get(),bfutureTask.get());
        Integer result = cFunction(afutureTask.get(), bfutureTask.get());
        log.info("结果为：{}",result);
        long end = System.currentTimeMillis();
        log.info("用时：{}",end-start);
    }

    private Integer cFunction(Integer a, Integer b){
        return a+b;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new CallableDemo().caculate();
    }
}
