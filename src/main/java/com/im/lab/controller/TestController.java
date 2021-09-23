package com.im.lab.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/9/22
 */
@RestController
@RequestMapping
public class TestController {

    @Value("${lab.name}")
    public String labName;

    @GetMapping("value")
    public String value(){
        return labName;
    }

}
