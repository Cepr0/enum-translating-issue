package io.github.cepr0.enumtranslatingissue;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.EnumSet;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(UserRepo repo) {
		return args -> repo.save(new User("user1", EnumSet.of(Role.ADMIN, Role.USER)));
	}
}
