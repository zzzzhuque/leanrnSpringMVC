package com.zt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhuque
 * @date 2021/08/07
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求编码格式
        req.setCharacterEncoding("utf-8");
        // 设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        // 获取请求信息
        String method = req.getParameter("method");
        // 处理请求信息
        if ("add".equals(method)) {
            req.getSession().setAttribute("msg", "执行了add方法");
        }
        if ("delete".equals(method)) {
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        // 响应处理结果
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }
}
