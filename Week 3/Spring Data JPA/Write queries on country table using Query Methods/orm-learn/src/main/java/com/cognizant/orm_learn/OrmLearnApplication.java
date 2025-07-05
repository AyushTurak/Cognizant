package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testCountryFeatures();

        LOGGER.info("Inside main");

    }

    private static void testCountryFeatures() {
        LOGGER.info("---- Test: Find by Partial Name ----");
        List<Country> countriesByPartialName = countryService.findCountriesByPartialName("ou");
        countriesByPartialName.forEach(country -> LOGGER.info("Match: {}", country));

        LOGGER.info("---- Test: Find by Partial Name Ordered Ascending ----");
        List<Country> countries = countryService.findCountriesByPartialName("ou");
        countries.forEach(country -> LOGGER.info("Match: {}", country));

        LOGGER.info("---- Test: Find by First Character of Code ----");
        List<Country> countriesByCode = countryService.findCountriesByCode('Z');
        countriesByCode.forEach(country -> LOGGER.info("Country: {}", country));
    }
}
