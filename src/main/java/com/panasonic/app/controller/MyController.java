package com.panasonic.app.controller;

import com.panasonic.app.model.City;
import com.panasonic.app.model.Data;
import com.panasonic.app.service.DragonBallService;
import com.panasonic.app.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;

    @Autowired
    private DragonBallService dragonBallService;

    @GetMapping(value = "/cities/{id}")
    public City getCity(@PathVariable Long id) {

        return cityService.findById(id);
    }

    @PostMapping(value = "/cities", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public City createCity(@RequestBody @Valid City city) {

        return cityService.save(city);
    }

    @GetMapping(value = "/cities")
    public List<City> findAll() {

        return cityService.findAll();
    }




    @PostMapping()
    public Data listDragonBall() {
        return dragonBallService.listALLDragonBall();

    }



}