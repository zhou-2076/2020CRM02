package com.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.sc.mapper") //扫描mapper接口所在的包，注册成bean对象
@SpringBootApplication
public class CRM_02_8080 {

	public static void main(String[] args) {
		SpringApplication.run(CRM_02_8080.class, args);
	}
	//http://localhost:8080/CRM02/login.jsp
}
