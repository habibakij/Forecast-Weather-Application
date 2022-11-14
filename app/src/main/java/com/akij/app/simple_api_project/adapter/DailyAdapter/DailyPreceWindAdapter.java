package com.akij.app.simple_api_project.adapter.DailyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.DailyForecast.DailyPreceWindModel;
import com.akij.app.simple_api_project.model.DailyForecast.DailyRainSnowfallModel;

import java.util.List;

public class DailyPreceWindAdapter extends RecyclerView.Adapter<DailyPreceWindAdapter.DailyPreceWindAdapterViewHolder> {

    private Context context;
    private List<DailyPreceWindModel> dailyPreceWindModels;

    public DailyPreceWindAdapter(Context context, List<DailyPreceWindModel> dailyPreceWindModels) {
        this.context = context;
        this.dailyPreceWindModels = dailyPreceWindModels;
    }

    @NonNull
    @Override
    public DailyPreceWindAdapter.DailyPreceWindAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_prece_wind_item, parent, false);
        return new DailyPreceWindAdapter.DailyPreceWindAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyPreceWindAdapter.DailyPreceWindAdapterViewHolder holder, int position) {
        DailyPreceWindModel model= dailyPreceWindModels.get(position);
        holder.txtDailyPrecipitation.setText(String.valueOf(model.getPrecipitation()));
        holder.txtDailyWind.setText(String.valueOf(model.getWind()));
        holder.txtDailyTime.setText(model.getTime());
    }

    @Override
    public int getItemCount() {
        return dailyPreceWindModels.size();
    }

    public static class DailyPreceWindAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView txtDailyPrecipitation, txtDailyWind, txtDailyTime;

        public DailyPreceWindAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtDailyPrecipitation= itemView.findViewById(R.id.txt_daily_precipitation);
            this.txtDailyWind= itemView.findViewById(R.id.txt_daily_wind);
            this.txtDailyTime= itemView.findViewById(R.id.txt_daily_prece_wind_time);
        }
    }
}
