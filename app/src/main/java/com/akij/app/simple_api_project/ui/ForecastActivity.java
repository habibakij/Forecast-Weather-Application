package com.akij.app.simple_api_project.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

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

import java.util.ArrayList;

public class ForecastActivity extends AppCompatActivity {

    TextView txtDailyTemperature, txtDailyCity, txtDailyHumidity, txtDailyWind;
    RecyclerView recyclerViewMaxMinTemperature, recyclerViewSunny, recyclerViewRainSnowfall, recyclerViewPreceWind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        FindView();

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

        ArrayList<DailyMaxMinTemperatureModel> maxMinList= new ArrayList<DailyMaxMinTemperatureModel>();
        ArrayList<DailySunnyModel> sunnyList= new ArrayList<DailySunnyModel>();
        ArrayList<DailyRainSnowfallModel> rainSnowfallList= new ArrayList<DailyRainSnowfallModel>();
        ArrayList<DailyPreceWindModel> preceWindList= new ArrayList<DailyPreceWindModel>();

        maxMinList.add(new DailyMaxMinTemperatureModel(35.25, 25.50));
        maxMinList.add(new DailyMaxMinTemperatureModel(30.20, 20.28));
        maxMinList.add(new DailyMaxMinTemperatureModel(32.27, 22.25));

        sunnyList.add(new DailySunnyModel("7:20", "6:25"));
        sunnyList.add(new DailySunnyModel("7:10", "6:15"));
        sunnyList.add(new DailySunnyModel("7:15", "6:50"));

        rainSnowfallList.add(new DailyRainSnowfallModel(0.20, 1.50));
        rainSnowfallList.add(new DailyRainSnowfallModel(1.50, 2.01));
        rainSnowfallList.add(new DailyRainSnowfallModel(2.02, 0.09));

        preceWindList.add(new DailyPreceWindModel(1.02, 1.00));
        preceWindList.add(new DailyPreceWindModel(0.90, 3.00));
        preceWindList.add(new DailyPreceWindModel(1.52, 2.00));

        DailyMaxMinAdapter adapter= new DailyMaxMinAdapter(this, maxMinList);
        recyclerViewMaxMinTemperature.setAdapter(adapter);
        DailySunnyAdapter adapter1= new DailySunnyAdapter(this, sunnyList);
        recyclerViewSunny.setAdapter(adapter1);
        DailyRainSnowfallAdapter adapter2= new DailyRainSnowfallAdapter(this, rainSnowfallList);
        recyclerViewRainSnowfall.setAdapter(adapter2);
        DailyPreceWindAdapter adapter3= new DailyPreceWindAdapter(this, preceWindList);
        recyclerViewPreceWind.setAdapter(adapter3);

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
    }

}