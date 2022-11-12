package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyRainSnowfallModel {
    private double Rain;
    private double Snowfall;

    public DailyRainSnowfallModel(double rain, double snowfall) {
        Rain = rain;
        Snowfall = snowfall;
    }

    public double getRain() {
        return Rain;
    }

    public double getSnowfall() {
        return Snowfall;
    }
}
