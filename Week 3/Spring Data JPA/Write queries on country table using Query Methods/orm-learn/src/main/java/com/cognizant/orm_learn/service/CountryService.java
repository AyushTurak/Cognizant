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

    public List<Country> findCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Country> findCountriesByPartialNameAscOrder(String name) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByName(name);
    }

    public List<Country> findCountriesByCode(char code) {
        return countryRepository.findByCodeStartingWithIgnoreCase(code);
    }
}
