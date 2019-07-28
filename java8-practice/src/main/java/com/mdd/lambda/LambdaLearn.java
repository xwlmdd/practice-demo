package com.mdd.lambda;

import org.junit.Test;

import java.util.*;

public class LambdaLearn {

    private static List<Employee> employees = new ArrayList();

    static {
        employees = Arrays.asList(
                new Employee("张三", 18, 1200),
                new Employee("莉丝", 49, 8900),
                new Employee("李四", 30, 5000),
                new Employee("王五", 22, 6090),
                new Employee("赵六", 16, 9444),
                new Employee("田七", 15, 9009),
                new Employee("胡八", 14, 4990),
                new Employee("许先", 14, 4990)
        );
    }

    /**
     * lambda 表达式 -> 表达式提供可以传递函数、代码功能
     * 左侧：表达式参数
     * 右侧：表达式函数体
     *
     *
     */

    /**
     *
     *
     *
     *
     *
     *
     */

    @Test
    public void test1() {
        Runnable runnable = () -> System.out.println("hello world");
        runnable.run();
    }

    @Test
    public void test2() {
//        Comparator<Integer> comparable = (a, b) -> Integer.compare(a, b);

        /**
         * 先按年龄排序，年龄相等则按名字排序
         */
        Collections.sort(employees, (employeeNum1, employeeNum2) -> {
                    if (Objects.equals(employeeNum1.getAge(), employeeNum2.getAge())) {
                        return employeeNum1.getName().compareTo(employeeNum2.getName());
                    }
                    return Integer.compare(employeeNum1.getAge(), employeeNum2.getAge());
                }
        );

        employees.stream().forEach(System.out::println);
    }

    @Test
    public void lambdaTest() {
        employees.stream().filter(employee -> employee.getAge() > 22).forEach(System.out::println);

    }

}
