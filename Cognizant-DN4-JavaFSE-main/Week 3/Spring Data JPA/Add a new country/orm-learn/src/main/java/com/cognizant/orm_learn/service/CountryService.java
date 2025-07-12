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

    public Country getCountryById(String id) {
        return countryRepository.findById(id).orElse(null);
    }

    @Transactional
    public Country addNewCountry(Country country) {
        return countryRepository.save(country);
    }
}
