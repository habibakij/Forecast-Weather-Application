package com.akij.app.simple_api_project.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {
    @SerializedName("speed")
    @Expose
    private double speed;
    @SerializedName("deg")
    @Expose
    private Integer deg;

    public double getSpeed() {
        return speed;
    }

    public Integer getDeg() {
        return deg;
    }

}