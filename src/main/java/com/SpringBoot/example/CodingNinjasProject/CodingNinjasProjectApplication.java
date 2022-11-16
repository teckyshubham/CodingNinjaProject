package com.SpringBoot.example.CodingNinjasProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//import org.springframework.context.annotation.Bean;

//import com.SpringBoot.example.CodingNinjasProject.EnableSwagger2;



@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
public class CodingNinjasProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingNinjasProjectApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfigration() {
		 return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
//		          .apis(RequestHandlerSelectors.any())              
//		          .paths(PathSelectors.any())                          
		          .build();  
	}


}
