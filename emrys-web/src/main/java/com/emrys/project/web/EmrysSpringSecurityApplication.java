package com.emrys.project.web;

import com.emrys.project.data.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.emrys.project.data")
@ComponentScan(basePackages = "com.emrys.project")
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EmrysSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmrysSpringSecurityApplication.class, args);
	}

}
