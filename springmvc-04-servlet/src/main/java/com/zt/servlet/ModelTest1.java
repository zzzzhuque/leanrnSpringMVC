package com.zt.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        System.out.println(session.getId());

        // 默认转发
        return "hello";
    }

    @RequestMapping("m1/t2")
    public String test2(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());

        // 重定向
        return "redirect:/index.jsp";
    }
}
