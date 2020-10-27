package com.jxd.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName EmpApplication
 * @Description TODO
 * @Author Deng ShenYi
 * @Date 2020/10/22
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.jxd.emp.mapper")
@ComponentScan(basePackages = "com.jxd")
//默认扫描emp包
public class EmpApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class);
    }
}
