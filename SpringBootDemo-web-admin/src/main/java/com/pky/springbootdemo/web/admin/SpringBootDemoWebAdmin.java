package com.pky.springbootdemo.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.pky.springbootdemo")  //将所有模块中的基于该包名进行扫描
@MapperScan(basePackages = "com.pky.springbootdemo.commons.mapper")  //指定扫描 mapper，避免扫描到 tk.mybatis.mapper 包的接口
@EnableTransactionManagement //开启事务支持，需要则加入
public class SpringBootDemoWebAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebAdmin.class);
    }
}
