package com.lxf.tkmybatisspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lxf")
public class TkMybatisSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisSpringBootApplication.class, args);
    }

}
