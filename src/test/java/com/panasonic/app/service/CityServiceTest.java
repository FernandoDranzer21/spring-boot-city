package com.panasonic.app.service;

import com.panasonic.app.model.City;
import com.panasonic.app.repository.CityRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class CityServiceTest {

    private static final long ID=1;
    private static final String LIMA = "Lima";
    private static final int POPULATION =100;

    private static final City CITY = new City();
    private static  final Optional<City> Optional_CITY = Optional.of(CITY);

    @Mock
    private CityRepository cityRepository;


    @InjectMocks
    CityService cityService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        CITY.setId(ID);
        CITY.setName(LIMA);
        CITY.setPopulation(POPULATION);
    }


    @Test
    public void findBy(){
        Mockito.when(cityRepository.findById(ID))
                .thenReturn(Optional_CITY);

        City city =cityService.findById(ID);
        Assert.assertEquals(city,CITY);

    }
}
