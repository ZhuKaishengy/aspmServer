package com.aisino;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by zhukaishengy on 2018/3/21.
 * 注意：@SpringBootApplication注解是一个组合注解，包括自动扫描包，只能扫描到主配置类所在的包
 */
@EnableTransactionManagement
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).run(args);
    }
}
