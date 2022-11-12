package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyPreceWindModel {
    private double Precipitation;
    private double Wind;

    public DailyPreceWindModel(double precipitation, double wind) {
        Precipitation = precipitation;
        Wind = wind;
    }

    public double getPrecipitation() {
        return Precipitation;
    }

    public double getWind() {
        return Wind;
    }
}
