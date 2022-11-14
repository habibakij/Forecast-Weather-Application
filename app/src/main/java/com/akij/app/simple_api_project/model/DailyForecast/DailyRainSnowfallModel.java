package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyRainSnowfallModel {
    private double Rain;
    private double Snowfall;
    private String Time;

    public DailyRainSnowfallModel(double rain, double snowfall, String time) {
        Rain = rain;
        Snowfall = snowfall;
        Time= time;
    }

    public double getRain() {
        return Rain;
    }

    public double getSnowfall() {
        return Snowfall;
    }

    public String getTime() {return Time;}
}
