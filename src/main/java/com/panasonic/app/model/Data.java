package com.panasonic.app.model;

import java.io.Serializable;

import java.util.*;

public class Data implements Serializable {

    List<DragonBall> data;

    public List<DragonBall> getData() {
        return data;
    }

    public void setData(List<DragonBall> data) {
        this.data = data;
    }
}
