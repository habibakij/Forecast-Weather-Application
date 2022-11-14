package com.akij.app.simple_api_project.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WeatherModel {
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("generationtime_ms")
    @Expose
    private Double generationtimeMs;
    @SerializedName("utc_offset_seconds")
    @Expose
    private Integer utcOffsetSeconds;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("timezone_abbreviation")
    @Expose
    private String timezoneAbbreviation;
    @SerializedName("elevation")
    @Expose
    private Double elevation;
    @SerializedName("hourly_units")
    @Expose
    private HourlyUnits hourlyUnits;
    @SerializedName("hourly")
    @Expose
    private Hourly hourly;
    @SerializedName("daily_units")
    @Expose
    private DailyUnits dailyUnits;
    @SerializedName("daily")
    @Expose
    private Daily daily;

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getGenerationtimeMs() {
        return generationtimeMs;
    }

    public Integer getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public Double getElevation() {
        return elevation;
    }

    public HourlyUnits getHourlyUnits() {
        return hourlyUnits;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public DailyUnits getDailyUnits() {
        return dailyUnits;
    }

    public Daily getDaily() {
        return daily;
    }

}
