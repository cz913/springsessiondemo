package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @PackageName: com.offcn.controller
 * @ClassName: TestController
 * @Description: 加油，宝贝
 * @Author Orange
 * @Date 2020/10/22 9:20
 */
@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session) {
        session.setAttribute("msg", "Hello");
        return "OK";
    }
    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
