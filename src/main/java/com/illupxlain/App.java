package com.illupxlain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  { "com.illuxplain.controllers"})
@EnableJpaRepositories(basePackages = {"com.illuxplain.repository"} )
@EntityScan("com.illuxplain.models")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
