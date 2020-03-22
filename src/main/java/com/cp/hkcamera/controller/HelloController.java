package com.cp.hkcamera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 11:24
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
