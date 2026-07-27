package com.cognizant.spring_learn.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {

        List<Country> countries = Arrays.asList(
                createCountry("IN", "India"),
                createCountry("US", "United States"),
                createCountry("JP", "Japan"),
                createCountry("DE", "Germany")
        );

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }

    private Country createCountry(String code, String name) {
        Country country = new Country();
        country.setCode(code);
        country.setName(name);
        return country;
    }
}