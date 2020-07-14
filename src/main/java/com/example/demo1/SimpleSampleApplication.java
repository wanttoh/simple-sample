package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import filter.GlobalCorsConf;

@SpringBootApplication
@MapperScan("com.example.demo1.dao")
@Import(GlobalCorsConf.class)
public class SimpleSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSampleApplication.class, args);
	}
}
