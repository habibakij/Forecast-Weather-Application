package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyMaxMinTemperatureModel {
    private double MaxTemperature;
    private double MinTemperature;
    private String Time;

    public DailyMaxMinTemperatureModel(double maxTemperature, double minTemperature, String time) {
        MaxTemperature = maxTemperature;
        MinTemperature = minTemperature;
        Time= time;
    }

    public double getMaxTemperature() {
        return MaxTemperature;
    }

    public double getMinTemperature() {
        return MinTemperature;
    }

    public String getTime(){return Time;}
}
