package com.sarasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sarasa.springhibernatetest.Services")
@ComponentScan("com.sarasa.springhibernatetest")
@EnableJpaRepositories(basePackages = "com.sarasa.springhibernatetest")
public class SpringHibernateTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateTestApplication.class, args);
	}
}
