package com.akij.app.simple_api_project.model;

public class HomeAllHoursTemperatureModel {

    private final String date;
    private final String temperature;

    public HomeAllHoursTemperatureModel(String date, String temperature) {
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
