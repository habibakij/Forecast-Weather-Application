package com.akij.app.simple_api_project.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Daily {
    @SerializedName("time")
    @Expose
    private List<String> time = null;
    @SerializedName("weathercode")
    @Expose
    private List<Integer> weathercode = null;
    @SerializedName("temperature_2m_max")
    @Expose
    private List<Double> temperature2mMax = null;
    @SerializedName("temperature_2m_min")
    @Expose
    private List<Double> temperature2mMin = null;
    @SerializedName("sunrise")
    @Expose
    private List<String> sunrise = null;
    @SerializedName("sunset")
    @Expose
    private List<String> sunset = null;
    @SerializedName("rain_sum")
    @Expose
    private List<Double> rainSum = null;
    @SerializedName("showers_sum")
    @Expose
    private List<Double> showersSum = null;
    @SerializedName("snowfall_sum")
    @Expose
    private List<Double> snowfallSum = null;
    @SerializedName("precipitation_hours")
    @Expose
    private List<Double> precipitationHours = null;
    @SerializedName("windspeed_10m_max")
    @Expose
    private List<Double> windspeed10mMax = null;

    public List<String> getTime() {
        return time;
    }

    public List<Integer> getWeathercode() {
        return weathercode;
    }

    public List<Double> getTemperature2mMax() {
        return temperature2mMax;
    }

    public List<Double> getTemperature2mMin() {
        return temperature2mMin;
    }

    public List<String> getSunrise() {
        return sunrise;
    }

    public List<String> getSunset() {
        return sunset;
    }

    public List<Double> getRainSum() {
        return rainSum;
    }

    public List<Double> getShowersSum() {
        return showersSum;
    }

    public List<Double> getSnowfallSum() {
        return snowfallSum;
    }

    public List<Double> getPrecipitationHours() {
        return precipitationHours;
    }

    public List<Double> getWindspeed10mMax() {
        return windspeed10mMax;
    }

}
