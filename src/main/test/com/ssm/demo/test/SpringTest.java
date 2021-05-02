package com.ssm.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/2 0002
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //获取运用上下文
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();
    }

    public void sayHello(){
        System.out.println("hello yangxiaoqiang");
    }

}
