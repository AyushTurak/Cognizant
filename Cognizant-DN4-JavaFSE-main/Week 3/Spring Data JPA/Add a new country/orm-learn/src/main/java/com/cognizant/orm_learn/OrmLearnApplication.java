package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testAddCountry();

        LOGGER.info("Inside main");

    }

    private static void testAddCountry() {
        LOGGER.info("---- Test: Add Country ----");
        Country newCountry = new Country();
        newCountry.setCode("AB");
        newCountry.setName("ABC");
        countryService.addNewCountry(newCountry);

        LOGGER.info("---- Test: Find by Code ----");
        Country country = countryService.getCountryById("AB");
        LOGGER.info("Country: {}", country);
    }
}
