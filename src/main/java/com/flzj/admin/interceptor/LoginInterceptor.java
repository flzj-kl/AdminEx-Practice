package com.flzj.admin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    // 目标方法执行前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 登入检查逻辑
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");

        if(loginUser != null){
            return true;
        }
        request.setAttribute("msg","请先登入");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}
