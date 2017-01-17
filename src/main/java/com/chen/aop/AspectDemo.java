package com.chen.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//声明这是一个切面Bean
@Aspect
public class AspectDemo {

    //配置切入点   web包下所有方法
    @Pointcut("execution(* com.chen.web.*.*(..))")
    public void aspect(){}

    //配置前置通知
    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before方法，前置通知。。");
        System.out.println("切入的类名："+joinPoint.getTarget().getClass().getSimpleName());
        System.out.println("切入的方法名"+joinPoint.getSignature().getName());
    }

    //配置后置通知
    @After("aspect()")
    public void after(JoinPoint joinPoint){  //当某连接点退出的时候执行的通知（不论是正常返回还是异常退出）。
        System.out.println("After方法，后置通知。。"+joinPoint.getSignature());
    }

    //配置环绕通知
    @Around("aspect()")
    public void around(JoinPoint joinPoint){//可以直接用这个ProceedingJoinPoint参数
        System.out.println("Around方法，环绕通知。。111111");
        try {
            ((ProceedingJoinPoint) joinPoint).proceed();  //执行目标方法
            System.out.println("Around方法，环绕通知。。222222222");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    //配置后置返回通知,使用在方法aspect()上注册的切入点
    @AfterReturning("aspect()")
    public void afterReturn(JoinPoint joinPoint){
        System.out.println("AfterReturning方法，返回通知。。");
    }

    //配置抛出异常后通知
    @AfterThrowing("aspect()")
    public void afterThrowing(){

    }
}
