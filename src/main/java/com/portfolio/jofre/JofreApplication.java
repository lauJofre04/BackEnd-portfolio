package com.portfolio.jofre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.portfolio.jofre.Service"})
@EntityScan("com.portfolio.jofre.Entity")
@EnableJpaRepositories("com.portfolio.jofre.Repository")
public class JofreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JofreApplication.class, args);
	}

}
