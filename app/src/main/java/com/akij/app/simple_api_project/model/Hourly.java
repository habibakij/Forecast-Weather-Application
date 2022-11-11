package com.akij.app.simple_api_project.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hourly {
    @SerializedName("time")
    @Expose
    private List<String> time = null;
    @SerializedName("temperature_2m")
    @Expose
    private List<Double> temperature2m = null;
    @SerializedName("relativehumidity_2m")
    @Expose
    private List<Integer> relativehumidity2m = null;
    @SerializedName("precipitation")
    @Expose
    private List<Double> precipitation = null;
    @SerializedName("rain")
    @Expose
    private List<Double> rain = null;
    @SerializedName("showers")
    @Expose
    private List<Double> showers = null;
    @SerializedName("snowfall")
    @Expose
    private List<Double> snowfall = null;
    @SerializedName("weathercode")
    @Expose
    private List<Integer> weathercode = null;
    @SerializedName("surface_pressure")
    @Expose
    private List<Double> surfacePressure = null;
    @SerializedName("cloudcover_low")
    @Expose
    private List<Integer> cloudcoverLow = null;
    @SerializedName("cloudcover_mid")
    @Expose
    private List<Integer> cloudcoverMid = null;
    @SerializedName("cloudcover_high")
    @Expose
    private List<Integer> cloudcoverHigh = null;
    @SerializedName("visibility")
    @Expose
    private List<Double> visibility = null;
    @SerializedName("evapotranspiration")
    @Expose
    private List<Double> evapotranspiration = null;
    @SerializedName("windspeed_10m")
    @Expose
    private List<Double> windspeed10m = null;
    @SerializedName("winddirection_10m")
    @Expose
    private List<Integer> winddirection10m = null;
    @SerializedName("soil_temperature_0cm")
    @Expose
    private List<Double> soilTemperature0cm = null;
    @SerializedName("soil_moisture_0_1cm")
    @Expose
    private List<Double> soilMoisture01cm = null;

    public List<String> getTime() {
        return time;
    }

    public List<Double> getTemperature2m() {
        return temperature2m;
    }

    public List<Integer> getRelativehumidity2m() {
        return relativehumidity2m;
    }

    public List<Double> getPrecipitation() {
        return precipitation;
    }

    public List<Double> getRain() {
        return rain;
    }

    public List<Double> getShowers() {
        return showers;
    }

    public List<Double> getSnowfall() {
        return snowfall;
    }

    public List<Integer> getWeathercode() {
        return weathercode;
    }

    public List<Double> getSurfacePressure() {
        return surfacePressure;
    }

    public List<Integer> getCloudcoverLow() {
        return cloudcoverLow;
    }

    public List<Integer> getCloudcoverMid() {
        return cloudcoverMid;
    }

    public List<Integer> getCloudcoverHigh() {
        return cloudcoverHigh;
    }

    public List<Double> getVisibility() {
        return visibility;
    }

    public List<Double> getEvapotranspiration() {
        return evapotranspiration;
    }

    public List<Double> getWindspeed10m() {
        return windspeed10m;
    }

    public List<Integer> getWinddirection10m() {
        return winddirection10m;
    }

    public List<Double> getSoilTemperature0cm() {
        return soilTemperature0cm;
    }

    public List<Double> getSoilMoisture01cm() {
        return soilMoisture01cm;
    }

}
