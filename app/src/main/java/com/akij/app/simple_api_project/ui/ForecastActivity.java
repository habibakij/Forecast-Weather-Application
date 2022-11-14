package com.akij.app.simple_api_project.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.akij.app.simple_api_project.MainActivity;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.adapter.DailyAdapter.DailyMaxMinAdapter;
import com.akij.app.simple_api_project.adapter.DailyAdapter.DailyPreceWindAdapter;
import com.akij.app.simple_api_project.adapter.DailyAdapter.DailyRainSnowfallAdapter;
import com.akij.app.simple_api_project.adapter.DailyAdapter.DailySunnyAdapter;
import com.akij.app.simple_api_project.adapter.HomeAllHoursTemperatureAdapter;
import com.akij.app.simple_api_project.model.DailyForecast.DailyMaxMinTemperatureModel;
import com.akij.app.simple_api_project.model.DailyForecast.DailyPreceWindModel;
import com.akij.app.simple_api_project.model.DailyForecast.DailyRainSnowfallModel;
import com.akij.app.simple_api_project.model.DailyForecast.DailySunnyModel;
import com.akij.app.simple_api_project.model.WeatherModel;
import com.google.gson.Gson;

import org.parceler.Parcels;

import java.util.ArrayList;

public class ForecastActivity extends AppCompatActivity {

    TextView txtDailyTemperature, txtDailyCity, txtDailyHumidity, txtDailyWind, toolbarTitle;
    ImageButton toolbarImageBtn;
    RecyclerView recyclerViewMaxMinTemperature, recyclerViewSunny, recyclerViewRainSnowfall, recyclerViewPreceWind;

    ArrayList<DailyMaxMinTemperatureModel> maxMinList= new ArrayList<>();
    ArrayList<DailySunnyModel> sunnyList= new ArrayList<>();
    ArrayList<DailyRainSnowfallModel> rainSnowfallList= new ArrayList<>();
    ArrayList<DailyPreceWindModel> preceWindList= new ArrayList<>();
    Toolbar toolbar;
    String title= "Forecast Weather App";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        Gson gson = new Gson();
        String strObj = getIntent().getStringExtra("WEATHER_OBJECT");
        WeatherModel weatherModel = gson.fromJson(strObj, WeatherModel.class);
        FindView();
        toolbarTitle.setText(title);
        toolbarImageBtn.setVisibility(View.VISIBLE);
        toolbarImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManager.scrollToPosition(0);
        layoutManager1.scrollToPosition(0);
        layoutManager2.scrollToPosition(0);
        layoutManager3.scrollToPosition(0);
        recyclerViewMaxMinTemperature.setLayoutManager(layoutManager);
        recyclerViewSunny.setLayoutManager(layoutManager1);
        recyclerViewRainSnowfall.setLayoutManager(layoutManager2);
        recyclerViewPreceWind.setLayoutManager(layoutManager3);

        if (weatherModel.getDaily() == null){
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
            return;
        } else {
            txtDailyTemperature.setText(String.valueOf(weatherModel.getHourly().getTemperature2m().get(0)));
            txtDailyCity.setText(weatherModel.getTimezone());
            txtDailyHumidity.setText(String.valueOf(weatherModel.getHourly().getRelativehumidity2m().get(0)+" %"));
            txtDailyWind.setText(String.valueOf(weatherModel.getHourly().getWindspeed10m().get(0))+" km/h");
            Log.d("check_data", String.valueOf(weatherModel.getDaily().getTime()));
            for (int i = 0; i < weatherModel.getDaily().getTime().size(); i++) {
                maxMinList.add(new DailyMaxMinTemperatureModel(weatherModel.getDaily().getTemperature2mMax().get(i), weatherModel.getDaily().getTemperature2mMin().get(i), weatherModel.getDaily().getTime().get(i)));
            }
            for (int i = 0; i < weatherModel.getDaily().getTime().size(); i++) {
                sunnyList.add(new DailySunnyModel(weatherModel.getDaily().getSunrise().get(i), weatherModel.getDaily().getSunset().get(i), weatherModel.getDaily().getTime().get(i)));
            }
            for (int i = 0; i < weatherModel.getDaily().getTime().size(); i++) {
                rainSnowfallList.add(new DailyRainSnowfallModel(weatherModel.getDaily().getRainSum().get(i), weatherModel.getDaily().getSnowfallSum().get(i), weatherModel.getDaily().getTime().get(i)));
            }
            for (int i = 0; i < weatherModel.getDaily().getTime().size(); i++) {
                preceWindList.add(new DailyPreceWindModel(weatherModel.getDaily().getPrecipitationHours().get(i), weatherModel.getDaily().getWindspeed10mMax().get(i), weatherModel.getDaily().getTime().get(i)));
            }
            DailyMaxMinAdapter adapter = new DailyMaxMinAdapter(this, maxMinList);
            recyclerViewMaxMinTemperature.setAdapter(adapter);
            DailySunnyAdapter adapter1 = new DailySunnyAdapter(this, sunnyList);
            recyclerViewSunny.setAdapter(adapter1);
            DailyRainSnowfallAdapter adapter2 = new DailyRainSnowfallAdapter(this, rainSnowfallList);
            recyclerViewRainSnowfall.setAdapter(adapter2);
            DailyPreceWindAdapter adapter3 = new DailyPreceWindAdapter(this, preceWindList);
            recyclerViewPreceWind.setAdapter(adapter3);
        }
    }

    void FindView(){
        txtDailyTemperature= findViewById(R.id.txt_daily_temperature);
        txtDailyCity= findViewById(R.id.txt_daily_city);
        txtDailyHumidity= findViewById(R.id.txt_daily_humidity);
        txtDailyWind= findViewById(R.id.txt_daily_wind);
        recyclerViewMaxMinTemperature= findViewById(R.id.daily_max_min_temperature_recycler_view);
        recyclerViewSunny= findViewById(R.id.daily_sunny_recycler_view);
        recyclerViewRainSnowfall= findViewById(R.id.daily_rain_snowfall_recycler_view);
        recyclerViewPreceWind= findViewById(R.id.daily_prece_wind_recycler_view);
        toolbar= findViewById(R.id.custom_toolbar_app);
        toolbarTitle= findViewById(R.id.toolbar_title);
        toolbarImageBtn= findViewById(R.id.toolbar_back_btn);
    }

}