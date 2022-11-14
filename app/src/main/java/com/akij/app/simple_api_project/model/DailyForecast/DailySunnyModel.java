package com.akij.app.simple_api_project.model.DailyForecast;

public class DailySunnyModel {
    private String Sunrise;
    private String Sunset;
    private String Time;

    public DailySunnyModel(String sunrise, String sunset, String time) {
        Sunrise = sunrise;
        Sunset = sunset;
        Time= time;
    }

    public String getSunrise() {
        return Sunrise;
    }

    public String getSunset() {
        return Sunset;
    }

    public String getTime() {return Time;}
}
