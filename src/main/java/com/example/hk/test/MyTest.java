package com.example.hk.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author huangkai
 * @desc
 * @date 2019/9/20
 */
public class MyTest {
    /**
     * 执行测试方法前执行
     */
    @Before
    public void before() {
        System.out.println("执行 before() 方法");
    }

    /**
     * 执行测试方法后执行
     */
    @After
    public void after() {
        System.out.println("执行 after() 方法");
    }

    @Test
    public void testSayHi() {
        System.out.println("Hi Log4j");
    }

    @Test
    public void testSayHello() {
        System.out.println("Hello Log4j");
    }

    /**
     * 测试断言
     */
    @Test
    public void testAssert() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        assertEquals(obj1, obj3);

        assertSame(obj3, obj4);

        assertNotSame(obj2, obj4);

        assertNotNull(obj1);

        assertNull(obj5);

        assertTrue("为真", var1 == var2);

        assertArrayEquals(arithmetic1, arithmetic2);
    }
}
