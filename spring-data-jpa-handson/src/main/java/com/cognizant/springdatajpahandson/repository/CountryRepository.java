package com.cognizant.springdatajpahandson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springdatajpahandson.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}