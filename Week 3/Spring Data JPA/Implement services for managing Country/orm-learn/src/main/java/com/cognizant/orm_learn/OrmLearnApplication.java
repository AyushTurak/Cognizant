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
        LOGGER.info("---- Test: Add Country ----");
        Country newCountry = new Country();
        newCountry.setCode("JP");
        newCountry.setName("Japan");
        countryService.addNewCountry(newCountry);

        LOGGER.info("---- Test: Find by Code ----");
        Country country = countryService.getCountryById("JP");
        LOGGER.info("Country: {}", country);

        LOGGER.info("---- Test: Update Country ----");
        country.setName("Japan Updated");
        countryService.updateCountry(country);
        LOGGER.info("Updated Country: {}", countryService.getCountryById("JP"));

        LOGGER.info("---- Test: Find by Partial Name ----");
        List<Country> countries = countryService.findCountriesByPartialName("Ind");
        countries.forEach(c -> LOGGER.info("Match: {}", c));

        LOGGER.info("---- Test: Delete Country ----");
        countryService.deleteCountry("JP");
        LOGGER.info("Deleted country with code JP");
    }
}
