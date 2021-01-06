package com.fmi.online.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class OnlineEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEventsApplication.class, args);
	}

}
