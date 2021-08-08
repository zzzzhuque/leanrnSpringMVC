package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    // origin: http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    // restful: http://localhost:8080/springmvc_04_controller_war_exploded/add/1/2
    // @RequestMapping(path = "/add/{a}/{b}", method = RequestMethod.GET)  // GET的冗余写法
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "test";
    }
}
