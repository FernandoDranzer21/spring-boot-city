package com.panasonic.app.service;

import com.panasonic.app.model.City;

import java.util.List;

public interface ICityService {

    City findById(Long id);
    City save(City city);
    List<City> findAll();
}
