package com.louis.springboot_wechat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//表示能够接受前台发送过来的请求，做出相应处理
@RestController

public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot";
    }
}


