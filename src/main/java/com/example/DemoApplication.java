package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


// 程序入口处
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("com.example.mapper")
//@MapperScan("com.example.mapper.BlogMapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
