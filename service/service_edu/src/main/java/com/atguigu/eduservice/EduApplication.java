package com.atguigu.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jiang--
 * @date2020/6/2121:55
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages={"com.atguigu"})
public class EduApplication {
    public static void main(String[] args){
        SpringApplication.run(EduApplication.class,args);
    }
}