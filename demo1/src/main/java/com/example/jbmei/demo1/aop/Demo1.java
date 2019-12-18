package com.example.jbmei.demo1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class Demo1 {

    private final Logger logger = LoggerFactory.getLogger(Demo1.class);


    @Pointcut("@annotation(com.example.jbmei.demo1.aop.AspectDemo)")
    public void privilege() {
        System.out.println("请求切面成功");
    }
    @Before(value = "privilege()")
    public void demo03(JoinPoint proceedingJoinPoint){
        List list=new ArrayList<>();
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        AspectDemo aspectDemo= method.getAnnotation(AspectDemo.class);
        logger.info(aspectDemo.rate()+"***"+aspectDemo.value());
        logger.info(method+"befor333");
    }



    @Around(value = "privilege()")
    public Object demo01(ProceedingJoinPoint proceedingJoinPoint){

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        AspectDemo aspectDemo= method.getAnnotation(AspectDemo.class);
        logger.info(aspectDemo.rate()+"***"+aspectDemo.value());
        logger.info(String.valueOf(method));
        Object o=null;
       try {
            o=proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
           throwable.printStackTrace();
        }
        return o;
    }

    @After(value = "privilege()")
    public Object demo02(JoinPoint proceedingJoinPoint){
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        AspectDemo aspectDemo= method.getAnnotation(AspectDemo.class);
        logger.info(aspectDemo.rate()+"***"+aspectDemo.value());
        logger.info(method+"after");
        return "nihao333";
    }

}
