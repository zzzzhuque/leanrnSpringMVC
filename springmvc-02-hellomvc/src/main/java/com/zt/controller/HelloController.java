package com.zt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author zhuque
 * @date 2021/08/07
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        // 业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg", result);

        // 视图跳转
        mv.setViewName("test"); // :/WEB-INF/jsp/test.jsp
        return mv;
    }
}
