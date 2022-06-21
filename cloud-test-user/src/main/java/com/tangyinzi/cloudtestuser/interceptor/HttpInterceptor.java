package com.tangyinzi.cloudtestuser.interceptor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

public class HttpInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(HttpInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        Map<String, String[]> parameterMap = request.getParameterMap();
        Enumeration<String> attributeNames = request.getAttributeNames();
        
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}


