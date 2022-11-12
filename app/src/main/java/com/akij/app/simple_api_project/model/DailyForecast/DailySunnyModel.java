package com.akij.app.simple_api_project.model.DailyForecast;

public class DailySunnyModel {
    private String Sunrise;
    private String Sunset;

    public DailySunnyModel(String sunrise, String sunset) {
        Sunrise = sunrise;
        Sunset = sunset;
    }

    public String getSunrise() {
        return Sunrise;
    }

    public String getSunset() {
        return Sunset;
    }
}
