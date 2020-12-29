package com.github.xuqplus.hello.gradle.app;

import com.github.xuqplus.hello.gradle.common.util.AUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class HelloGradleAppApplicationTests {

    @Test
    void contextLoads() {
        log.info("{}", AUtil.f());
    }

}
