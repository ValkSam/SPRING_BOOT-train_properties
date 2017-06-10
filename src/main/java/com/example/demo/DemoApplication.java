package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	MyProperties myProperties;

	@PostConstruct
	private void init(){
		myProperties.setHhh(123);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(DemoApplication.class)
				.properties(new HashMap<String, Object>(){{
					put("ccc",333);
					put("spring.config.location", "classpath:/params/override.properties");
				}})
				.run(args);
		System.out.println("Hello !");
	}
}
