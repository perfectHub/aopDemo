package com.chen.test;

import com.chen.web.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package com.chen.test
 * @Author chenh
 * @CreateDao 2017/1/17
 * @Description http://www.cnblogs.com/davidwang456/p/4013631.html
 * http://www.cnblogs.com/digdeep/p/4528353.html?utm_source=tuicool&utm_medium=referral
 * http://blog.csdn.net/udbnny/article/details/5870076
 * @Version 1.0
 */
public class TestAOP {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Controller c = (Controller)context.getBean("controller");
        c.print();
    }
}
