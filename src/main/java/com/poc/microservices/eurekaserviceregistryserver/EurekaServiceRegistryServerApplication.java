package com.poc.microservices.eurekaserviceregistryserver;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner displayBeansInApplication(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's see what's going behind the scenes for ServiceRegistry...........");
			String[] beans = ctx.getBeanDefinitionNames();
			Arrays.sort(beans);
			for (String bean : beans) {
				System.out.println("Bean :: " + bean);
			}
		};
	}
}
