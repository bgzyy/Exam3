package com.hand.exam.exam3test.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zhao'yin
 * Date 2019/7/18.
 */
@Aspect
public class ServiceAspect {

    @Pointcut("execution(public int com.hand.exam.exam3test.service.FilmService.insertFilm2(..))")
    public void point() { }

    /*
     * 目标方法执行前调用
     * */
    @Before("point()")
    public void before() {
        System.out.println("Before Insert Film Data");
    }

    /*
     * 目标方法正确结束调用
     * */
    @AfterReturning("point()")
    public void retu() {
        System.out.println("After Insert Film Data");
    }
}