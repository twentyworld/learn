package com.learn;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by teemper on 2018/7/4, 0:08.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */

@Aspect
@Component
public class LoggerAspect {
//    @Pointcut("execution(* com.learn.TestController.*(com.learn.Id)) && args(id)")
//    private void searchPointCut(Id id) { }
//
//    @Around(value = "searchPointCut(id)", argNames = "id")
//    public Object aroundController(ProceedingJoinPoint joinPoint, Id id) throws Throwable {
//        System.out.println(id);
//        return joinPoint.proceed();
//    }

    @Pointcut("@annotation(Logger) && args(id)")
    private void searchPointCut(Id id) { }

    @Around(value = "searchPointCut(id)", argNames = "id")
    public Object aroundController(ProceedingJoinPoint joinPoint, Validator id) throws Throwable {
        System.out.println(id);
        if (!id.valid()) throw new RuntimeException("wrong valid.");
        return joinPoint.proceed();
    }



}
