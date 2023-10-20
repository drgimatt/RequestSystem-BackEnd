package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Dog;

import java.util.List;

public interface ICountryService {
    List<Dog> getCountries();
    Dog addCountry(Dog country);
    Dog updateCountry(Long id, Dog country);
    Dog getCountry(Long id);
    void deleteCountry(Long id);
}