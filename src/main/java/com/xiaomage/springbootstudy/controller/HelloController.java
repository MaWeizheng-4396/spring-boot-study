package com.xiaomage.springbootstudy.controller;

import com.xiaomage.springbootstudy.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaomage
 * @date 2019/5/2 - 23:47
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() throws Exception {
        return "login";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/thymeleaf")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://www.baidu.com");
        return "index";
    }

}
