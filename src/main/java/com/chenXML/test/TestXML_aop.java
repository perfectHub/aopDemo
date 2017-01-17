package com.chenXML.test;

import com.chenXML.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package com.chenXML.test
 * @Author chenh
 * @CreateDao 2017/1/17
 * @Description
 * @Version 1.0
 */
public class TestXML_aop {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springXML.xml");
        TestController testController = (TestController) context.getBean("testController");
        testController.get();
    }
}
