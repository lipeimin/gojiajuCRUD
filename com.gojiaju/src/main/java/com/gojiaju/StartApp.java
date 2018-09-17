package com.gojiaju;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages="com.gojiaju")
@EnableAutoConfiguration
//开启swagger的界面
@EnableSwagger2
public class StartApp {
	
	private static Logger logger = Logger.getLogger(StartApp.class);
	
	//启动中心
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
		logger.info("============启动===========");
		
	}
	
}
