package com.akij.app.simple_api_project.model;

public class HomeTemperatureModel {

    private final String date;
    private final String temperature;

    public HomeTemperatureModel(String date, String temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public String getTemperature() {
        return temperature;
    }
}
