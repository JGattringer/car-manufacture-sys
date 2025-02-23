package io.github.jgattringer.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		// usually we dont change this class and use it as it comes
		SpringApplicationBuilder builder =
		new SpringApplicationBuilder(Application.class);

		// deactivate the banner when running the application
		builder.bannerMode(Banner.Mode.OFF);

		// we can setup profiles
		builder.profiles("producao", "homologacao");

		// start application
		builder.run(args);

		// context of the application already running
		ConfigurableApplicationContext applicationContext = builder.context();
				// var productsRepository = applicationContext.getBean("productRepository");

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("name of the application: " + applicationName);

	}

}
