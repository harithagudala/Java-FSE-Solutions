package com.cognizant.springdatajpahandson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springdatajpahandson.entity.Country;
import com.cognizant.springdatajpahandson.repository.CountryRepository;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}