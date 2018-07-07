package com.proxy.com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by teemper on 2018/7/7, 18:13.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teempe@163.com if anthing.
 * from win.
 */
public class DogProxyHandler implements InvocationHandler {

    private Object proxyied; //代理对象

    public DogProxyHandler(Object proxyied){
        this.proxyied = proxyied;  //初始化代理对象
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理调用前");
        System.out.println(method.getName() + method.getModifiers());
        return method.invoke(proxyied, args);
    }

}
