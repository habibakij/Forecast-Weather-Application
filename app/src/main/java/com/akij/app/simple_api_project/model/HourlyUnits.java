package com.akij.app.simple_api_project.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HourlyUnits {
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("temperature_2m")
    @Expose
    private String temperature2m;
    @SerializedName("rain")
    @Expose
    private String rain;
    @SerializedName("showers")
    @Expose
    private String showers;
    @SerializedName("snowfall")
    @Expose
    private String snowfall;
    @SerializedName("weathercode")
    @Expose
    private String weathercode;
    @SerializedName("surface_pressure")
    @Expose
    private String surfacePressure;
    @SerializedName("cloudcover_low")
    @Expose
    private String cloudcoverLow;
    @SerializedName("cloudcover_mid")
    @Expose
    private String cloudcoverMid;
    @SerializedName("cloudcover_high")
    @Expose
    private String cloudcoverHigh;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("evapotranspiration")
    @Expose
    private String evapotranspiration;
    @SerializedName("windspeed_10m")
    @Expose
    private String windspeed10m;
    @SerializedName("winddirection_10m")
    @Expose
    private String winddirection10m;
    @SerializedName("soil_temperature_0cm")
    @Expose
    private String soilTemperature0cm;
    @SerializedName("soil_moisture_0_1cm")
    @Expose
    private String soilMoisture01cm;

    public String getTime() {
        return time;
    }

    public String getTemperature2m() {
        return temperature2m;
    }

    public String getRain() {
        return rain;
    }

    public String getShowers() {
        return showers;
    }

    public String getSnowfall() {
        return snowfall;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public String getSurfacePressure() {
        return surfacePressure;
    }

    public String getCloudcoverLow() {
        return cloudcoverLow;
    }

    public String getCloudcoverMid() {
        return cloudcoverMid;
    }

    public String getCloudcoverHigh() {
        return cloudcoverHigh;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getEvapotranspiration() {
        return evapotranspiration;
    }

    public String getWindspeed10m() {
        return windspeed10m;
    }

    public String getWinddirection10m() {
        return winddirection10m;
    }

    public String getSoilTemperature0cm() {
        return soilTemperature0cm;
    }

    public String getSoilMoisture01cm() {
        return soilMoisture01cm;
    }

}