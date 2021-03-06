package com.atm.gymsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
    //空需要特殊处理,不然路径有问题
    @RequestMapping("")
    public ModelAndView emptyLogin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:user/index");
        return mv;
    }

    @RequestMapping("/user/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/user/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/user/center")
    public String center() {
        return "center";
    }

    @RequestMapping("/user/notice")
    public String notice() {
        return "notice";
    }
}
