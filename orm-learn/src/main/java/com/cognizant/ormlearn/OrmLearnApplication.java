package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import java.util.List;

@ComponentScan("com.cognizant.ormlearn")
@SpringBootApplication
public class OrmLearnApplication {
	@Autowired
	private static CountryService countryService;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OrmlearnApplication.class, args);
	}
	@Bean
	CommandLineRunner getAllCountries(CountryService countryService) {
		return args -> {
			logger.info("START...");
			List<Country> countries = countryService.getAllCountries();
			logger.debug("countries = {}", countries);
			logger.info("END...");
		};
	}
}
