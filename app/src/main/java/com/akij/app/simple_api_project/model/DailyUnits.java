package com.akij.app.simple_api_project.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyUnits {
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("weathercode")
    @Expose
    private String weathercode;
    @SerializedName("temperature_2m_max")
    @Expose
    private String temperature2mMax;
    @SerializedName("temperature_2m_min")
    @Expose
    private String temperature2mMin;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("rain_sum")
    @Expose
    private String rainSum;
    @SerializedName("showers_sum")
    @Expose
    private String showersSum;
    @SerializedName("snowfall_sum")
    @Expose
    private String snowfallSum;
    @SerializedName("precipitation_hours")
    @Expose
    private String precipitationHours;
    @SerializedName("windspeed_10m_max")
    @Expose
    private String windspeed10mMax;

    public String getTime() {
        return time;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public String getTemperature2mMax() {
        return temperature2mMax;
    }

    public String getTemperature2mMin() {
        return temperature2mMin;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getRainSum() {
        return rainSum;
    }

    public String getShowersSum() {
        return showersSum;
    }

    public String getSnowfallSum() {
        return snowfallSum;
    }

    public String getPrecipitationHours() {
        return precipitationHours;
    }

    public String getWindspeed10mMax() {
        return windspeed10mMax;
    }

}