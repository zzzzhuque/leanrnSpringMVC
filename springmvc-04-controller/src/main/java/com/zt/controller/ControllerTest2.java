package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhuque
 * @date 2021/08/08
 */
@Controller
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test2(Model model) {
        model.addAttribute("msg", "hello spring mvc");
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model) {
        model.addAttribute("msg", "test3");
        return "test";
    }
}
