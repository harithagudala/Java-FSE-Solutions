package com.cognizant.springdatajpahandson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.springdatajpahandson.entity.Country;
import com.cognizant.springdatajpahandson.service.CountryService;

@SpringBootApplication
public class SpringDataJpaHandsonApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandsonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (Country country : countryService.getAllCountries()) {
            System.out.println(country.getCode() + " - " + country.getName());
        }
    }
}
