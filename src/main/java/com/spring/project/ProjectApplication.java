package com.spring.project;

import com.spring.project.Repository.ServerRepository;
import com.spring.project.enumeration.Status;
import com.spring.project.model.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepo){
		return args->{
			serverRepo.save(new Server(null,"192.168.1.160","ubuntui",
					"16 GB","PC","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null,"192.168.1.162","fedora",
					"64 GB","laptop","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
		};
	}
}
