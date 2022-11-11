package com.akij.app.simple_api_project.network;


import com.akij.app.simple_api_project.model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    String endUrl= "forecast?latitude=23.75&longitude=90.38&hourly=temperature_2m,rain,showers,snowfall,weathercode,surface_pressure,cloudcover_low,cloudcover_mid,cloudcover_high,visibility,evapotranspiration,windspeed_10m,winddirection_10m,temperature_80m,soil_temperature_0cm,soil_temperature_6cm,soil_moisture_0_1cm,soil_moisture_1_3cm&daily=weathercode,temperature_2m_max,temperature_2m_min,sunrise,sunset,rain_sum,showers_sum,snowfall_sum,precipitation_hours,windspeed_10m_max,windgusts_10m_max&timezone=Asia%2FBangkok";
    //@GET("weather?lat=23.754383&lon=90.385970&appid=e0ba8fc6f3791657724ec8cbdde43c88") old
    @GET(endUrl)
    Call<WeatherModel> getAllWeatherData();

}
