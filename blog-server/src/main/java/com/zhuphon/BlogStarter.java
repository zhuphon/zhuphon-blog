package com.zhuphon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zhuphon.entity.Article;

/**
 * SpringBoot启动类
 * 
 * @author Zhu Phon
 * @date 2018年2月5日
 */
@SpringBootApplication
public class BlogStarter {

	public static void main(String[] args) {
		SpringApplication.run(BlogStarter.class, args);
	}
}
