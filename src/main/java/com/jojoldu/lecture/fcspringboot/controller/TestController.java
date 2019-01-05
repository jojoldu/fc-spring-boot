package com.jojoldu.lecture.fcspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jojoldu@gmail.com on 2019-01-05
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class TestController {

    @GetMapping("/plus")
    public String plus(@RequestParam("val1") int val1,
                       @RequestParam("val2") int val2) {
        return "result: " + (val1 + val2);
    }
}
