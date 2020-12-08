package com.panasonic.app.model;

import java.io.Serializable;

public class DragonBall implements Serializable {

    private String species;
    private String status;
    private String originPlanet;
    private String gender;
    private String _id;
    private String name;
    private String series;
    private String created;
    private String url;
    private String image;
    private int __v;

    public DragonBall(String species, String status, String originPlanet, String gender, String _id, String name, String series, String created, String url, String image, int __v) {
        this.species = species;
        this.status = status;
        this.originPlanet = originPlanet;
        this.gender = gender;
        this._id = _id;
        this.name = name;
        this.series = series;
        this.created = created;
        this.url = url;
        this.image = image;
        this.__v = __v;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginPlanet() {
        return originPlanet;
    }

    public void setOriginPlanet(String originPlanet) {
        this.originPlanet = originPlanet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
