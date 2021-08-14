package com.zt.servlet;

import com.zt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    // 前端接收普通数据
    // localhost:8080/user/t1?username=xxx
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        // 接收前端数据
        System.out.println("接收到的前端数据为：" + name);
        // 将返回的结果传递给前端
        model.addAttribute("msg", name);
        // 视图跳转
        return "hello";
    }

    /**
     * 前端接收User对象，包含id, name, age
     * 接收前端传递的数据时要求与对象成员变量一一对应，顺序可以不同
     * 否则报错
     */
    @GetMapping("/t2")
    public String test2(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", user.getName());
        return "hello";
    }
}
