package com.spjiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Package: com.spjiang
 *
 * @description:
 * @author: jiangshengping <spjiang@aliyun.com>
 * @create: 2022-07-19 17:44
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
@ServletComponentScan
public class JpaApplication {
    public static void main(String[] args) {
        System.out.println("start JpaApplication");
        SpringApplication.run(JpaApplication.class,args);
    }
}
