package com.chenXML.aop;

/**
 * @Package com.chenXML.aop
 * @Author chenh
 * @CreateDao 2017/1/17
 * @Description
 * @Version 1.0
 */
public class AspectDemo {

    public void doAfter(){
        System.out.println("houz后置通知-----当某连接点退出的时候执行的通知（不论是正常返回还是异常退出）");
    }
}
