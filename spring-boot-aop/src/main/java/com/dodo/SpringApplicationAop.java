package com.dodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringApplicationAop {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationAop.class, args);
    }
}
