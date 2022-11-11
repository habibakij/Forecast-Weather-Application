package com.akij.app.simple_api_project.network;
import com.akij.app.simple_api_project.model.WeatherModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {


    String endUrl= "forecast?latitude=23.75&longitude=90.38&hourly=temperature_2m,relativehumidity_2m,precipitation,rain,showers,snowfall,weathercode,surface_pressure,cloudcover_low,cloudcover_mid,cloudcover_high,visibility,evapotranspiration,windspeed_10m,winddirection_10m,soil_temperature_0cm,soil_moisture_0_1cm&daily=weathercode,temperature_2m_max,temperature_2m_min,sunrise,sunset,rain_sum,showers_sum,snowfall_sum,precipitation_hours,windspeed_10m_max&timezone=Asia%2FBangkok";
    @GET(endUrl)
    Call<WeatherModel> getAllWeatherData();

}
