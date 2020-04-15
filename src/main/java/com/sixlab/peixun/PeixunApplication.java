package com.sixlab.peixun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



//@SpringBootApplication 标注一个主程序类，说明这是一个springboot应用

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PeixunApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {

        //启动spring应用
        SpringApplication.run(PeixunApplication.class, args);
    }

}
