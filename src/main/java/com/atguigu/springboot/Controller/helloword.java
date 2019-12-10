package com.atguigu.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloword {
    @ResponseBody
    @RequestMapping("/hello")
    public String run(){
        return "helloword";
    }
}
