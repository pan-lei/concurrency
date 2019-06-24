package com.panlei.concurrency.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pan_l
 * @ClassName TestController
 * @Description
 * @date 2019-06-11 15:09
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "test";
    }
}
