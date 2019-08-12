package com.learning.core;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 **/
public class MyInteceptor implements HandlerInterceptor {

    /**
     * 执行方法之前
     **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行方法之前");
        return true;
    }
}
