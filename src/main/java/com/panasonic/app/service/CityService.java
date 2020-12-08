package com.panasonic.app.service;

import com.panasonic.app.exception.CityNotFoundException;
import com.panasonic.app.exception.NoDataFoundException;
import com.panasonic.app.model.City;
import com.panasonic.app.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City findById(Long id) {

        City city = cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));

        return city;
    }

    @Override
    public City save(City city) {

        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {

        var cities = (List<City>) cityRepository.findAll();

        if (cities.isEmpty()) {

            throw new NoDataFoundException();
        }

        return cities;
    }
}