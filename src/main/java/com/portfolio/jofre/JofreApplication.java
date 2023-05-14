package com.portfolio.jofre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan("com.portfolio.jofre.Security")
@EntityScan({"com.portfolio.jofre.Security.Enuns.Entity"})
@EnableJpaRepositories
@EnableTransactionManagement
public class JofreApplication {

	public static void main(String[] args) {
		SpringApplication.run(JofreApplication.class, args);
	}

}
