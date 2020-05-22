package emrys.spring.security;

import emrys.spring.security.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EmrysSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmrysSpringSecurityApplication.class, args);
	}

}
