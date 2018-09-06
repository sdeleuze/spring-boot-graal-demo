package com.example.graaldemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext;

@SpringBootApplication
public class GraalDemoApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(GraalDemoApplication.class);
		application.setWebApplicationType(WebApplicationType.REACTIVE);
		application.setApplicationContextClass(ReactiveWebServerApplicationContext.class);
		application.run(args);
	}
}
