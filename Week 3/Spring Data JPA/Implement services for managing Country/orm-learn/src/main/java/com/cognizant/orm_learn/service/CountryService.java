package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(String id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country addNewCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(Country country) {
        if (countryRepository.existsById(country.getCode())) {
            return countryRepository.save(country);
        } else {
            return null;
        }
    }

    public void deleteCountry(String code) {
        if (countryRepository.existsById(code)){
            countryRepository.deleteById(code);
        }
    }

    public List<Country> findCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}
