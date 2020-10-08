package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages={"com.example"})
@EnableSwagger2
public class UstEmployeeSeatAllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstEmployeeSeatAllocationApplication.class, args);
	}
	@Bean
	public Docket customizeSwagger() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.paths(PathSelectors.regex("/employee/.*"))
			.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
			.build()
			.apiInfo(apiDetails());
	 
 }
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"CRUD Operations", 
				"CRUD Operations over Employee", 
				"2.0", 
				"Na", 
				new Contact("Preethu", "http://www.ust-global.com/", "a@b.c"), 
				"free license", 
				"na", 
				Collections.emptyList());
		
	}
}
