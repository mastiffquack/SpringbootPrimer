package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    //Spring 应用启动起来
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
