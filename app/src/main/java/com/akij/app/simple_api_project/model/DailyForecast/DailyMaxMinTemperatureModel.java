package com.akij.app.simple_api_project.model.DailyForecast;

public class DailyMaxMinTemperatureModel {
    private double MaxTemperature;
    private double MinTemperature;

    public DailyMaxMinTemperatureModel(double maxTemperature, double minTemperature) {
        MaxTemperature = maxTemperature;
        MinTemperature = minTemperature;
    }

    public double getMaxTemperature() {
        return MaxTemperature;
    }

    public double getMinTemperature() {
        return MinTemperature;
    }
}
