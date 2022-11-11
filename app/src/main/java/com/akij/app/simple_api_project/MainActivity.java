package com.akij.app.simple_api_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.akij.app.simple_api_project.adapter.HomeForecastTemperatureAdapter;
import com.akij.app.simple_api_project.model.HomeTemperatureModel;
import com.akij.app.simple_api_project.model.WeatherModel;
import com.akij.app.simple_api_project.network.APIClient;
import com.akij.app.simple_api_project.network.APIInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView txtTemperature, txtCity;
    APIInterface apiInterface;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Weather App");
        txtTemperature= findViewById(R.id.txt_temperature);
        txtCity= findViewById(R.id.txt_city);
        recyclerView= findViewById(R.id.forecast_temperature_recycler_view);
        //apiInterface = APIClient.getClient().create(APIInterface.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);


        List<HomeTemperatureModel> list= new ArrayList<>();
        list.add(new HomeTemperatureModel("01-10-2022", "30"));
        list.add(new HomeTemperatureModel("01-11-2022", "20"));
        list.add(new HomeTemperatureModel("01-12-2022", "35"));
        list.add(new HomeTemperatureModel("01-13-2022", "25"));
        list.add(new HomeTemperatureModel("01-14-2022", "15"));

        HomeForecastTemperatureAdapter adapter= new HomeForecastTemperatureAdapter(this, list);
        recyclerView.setAdapter(adapter);


    }
}














