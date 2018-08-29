package com.inteceptor.learn.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by teemper on 2018/8/30, 0:18.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@Component
public class WebHandlerInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    ThreadLocal<Date> threadLocal;

    private String name = "cache-name";


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandler");
        response.setHeader(name,"");
        return super.preHandle(request,response,handler);
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String value = threadLocal.get().toString();
        System.out.println(response.getHeader(name));

        System.out.println(value);
        response.setHeader(name, threadLocal.get().toString());
        super.postHandle(request,response,handler,modelAndView);
    }

}
