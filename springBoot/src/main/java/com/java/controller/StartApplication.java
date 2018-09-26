package com.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*单独存在，只存放springboot的启动程序*/
//包扫描：扫描controller、service
@SpringBootApplication(scanBasePackages={"com.java.controller"})
//开启springboot的默认配置
@EnableAutoConfiguration
public class StartApplication {

	public static void main(String[] args) {
		//内置了tomcat，因此springboot可以不用发布外部的tomcat服务器
		//springboot就是简化了ssm框架的搭建，类似于不用书写ssm的所有配置文件
		SpringApplication.run(StartApplication.class, args);

	}

}
