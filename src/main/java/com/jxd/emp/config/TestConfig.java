package com.jxd.emp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestConfig
 * @Description TODO
 * @Author Deng ShenYi
 * @Date 2020/10/23
 * @Version 1.0
 */
public class TestConfig {
    public static void main(String[] args) {
        //获取一个person对象
        ApplicationContext ac = new
                AnnotationConfigApplicationContext(DemoConfig.class);
        //会加载spring容器，扫描@Configuration注解配置类
        //并将其中bean注解方法的返回值加载到容器中
        Person person = (Person) ac.getBean("person");
        System.out.println(person.getName());
    }
}
