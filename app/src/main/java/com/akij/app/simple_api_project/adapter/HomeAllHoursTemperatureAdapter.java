package com.akij.app.simple_api_project.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.HomeAllHoursTemperatureModel;

import java.util.List;

public class HomeAllHoursTemperatureAdapter extends RecyclerView.Adapter<HomeAllHoursTemperatureAdapter.HomeForecastTemperatureAdapterViewHolder> {

    private Context context;
    private List<HomeAllHoursTemperatureModel> homeTemperatureModels;

    public HomeAllHoursTemperatureAdapter(Context context, List<HomeAllHoursTemperatureModel> homeTemperatureModels) {
        this.context = context;
        this.homeTemperatureModels = homeTemperatureModels;
    }

    @NonNull
    @Override
    public HomeForecastTemperatureAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_forecast_temperature_item, parent, false);
        return new HomeForecastTemperatureAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeForecastTemperatureAdapterViewHolder holder, int position) {
        HomeAllHoursTemperatureModel model= homeTemperatureModels.get(position);
        holder.txtForecastDate.setText(model.getDate());
        holder.txtForecastTemperature.setText(model.getTemperature());
    }

    @Override
    public int getItemCount() {
        return homeTemperatureModels.size();
    }

    public static class HomeForecastTemperatureAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView txtForecastDate, txtForecastTemperature;

        public HomeForecastTemperatureAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtForecastDate= itemView.findViewById(R.id.txt_forecast_date);
            this.txtForecastTemperature= itemView.findViewById(R.id.txt_forecast_temperature);
        }

    }
}