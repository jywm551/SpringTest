package com.yu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "HelloWorld";
    }

}
