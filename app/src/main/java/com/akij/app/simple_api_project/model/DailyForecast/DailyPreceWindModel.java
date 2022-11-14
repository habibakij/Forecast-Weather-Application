package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyPreceWindModel {
    private double Precipitation;
    private double Wind;
    private String Time;

    public DailyPreceWindModel(double precipitation, double wind, String time) {
        Precipitation = precipitation;
        Wind = wind;
        Time= time;
    }

    public double getPrecipitation() {
        return Precipitation;
    }

    public double getWind() {
        return Wind;
    }

    public String getTime() {return Time;}
}
