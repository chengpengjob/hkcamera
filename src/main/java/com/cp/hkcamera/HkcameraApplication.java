package com.cp.hkcamera;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.cp.hkcamera.mapper")
@EnableScheduling
public class HkcameraApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkcameraApplication.class, args);
    }

}
