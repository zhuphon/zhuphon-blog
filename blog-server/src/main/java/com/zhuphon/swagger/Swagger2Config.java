package com.zhuphon.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * swagger配置类
 *
 * @author Zhu Phon
 * @date 2018年2月5日
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

	@Value("${swagger2.title}")
	private String title;
	
	@Value("${swagger2.description}")
	private String description;
	
	@Value("${swagger2.version}")
	private String version;
	
	@Value("${swagger2.basePackage}")
	private String basePackage;
	
	@Value("${swagger2.url}")
	private String url;
	

	@Value("${swagger2.author}")
	private String author;
	
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(createApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage(basePackage))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo createApiInfo(){
		return new ApiInfoBuilder()
				.title(title)
				.contact(author)
				.description(description)
				.version(version)
				.build();
	}
}
