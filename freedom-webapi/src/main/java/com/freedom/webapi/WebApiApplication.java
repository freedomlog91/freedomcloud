package com.freedom.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zengzeng
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.freedom.*"})
public class WebApiApplication {

    public static void main (String[] args) {
        SpringApplication.run(WebApiApplication.class,args);
    }

}
