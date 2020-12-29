package com.github.xuqplus.hello.gradle.app.controller;

import com.github.xuqplus.hello.gradle.common.util.AUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping
    public String a() {
        return AUtil.f();
    }
}
