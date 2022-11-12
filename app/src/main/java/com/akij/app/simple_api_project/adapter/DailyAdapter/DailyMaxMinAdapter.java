package com.akij.app.simple_api_project.adapter.DailyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.DailyForecast.DailyMaxMinTemperatureModel;
import com.akij.app.simple_api_project.model.HomeHourlyModel;
import java.util.List;

public class DailyMaxMinAdapter extends RecyclerView.Adapter<DailyMaxMinAdapter.DailyMaxMinAdapterViewHolder> {

    private Context context;
    private List<DailyMaxMinTemperatureModel> dailyMaxMinTemperatureModels;

    public DailyMaxMinAdapter(Context context, List<DailyMaxMinTemperatureModel> dailyMaxMinTemperatureModels) {
        this.context = context;
        this.dailyMaxMinTemperatureModels = dailyMaxMinTemperatureModels;
    }

    @NonNull
    @Override
    public DailyMaxMinAdapter.DailyMaxMinAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_temp_item, parent, false);
        return new DailyMaxMinAdapter.DailyMaxMinAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMaxMinAdapter.DailyMaxMinAdapterViewHolder holder, int position) {
        DailyMaxMinTemperatureModel model= dailyMaxMinTemperatureModels.get(position);
        holder.txtDailyMaxTemperature.setText(String.valueOf(model.getMaxTemperature()));
        holder.txtDailyMinTemperature.setText(String.valueOf(model.getMinTemperature()));
    }

    @Override
    public int getItemCount() {
        return dailyMaxMinTemperatureModels.size();
    }

    public static class DailyMaxMinAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView txtDailyMaxTemperature, txtDailyMinTemperature;

        public DailyMaxMinAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtDailyMaxTemperature= itemView.findViewById(R.id.txt_daily_max_temperature);
            this.txtDailyMinTemperature= itemView.findViewById(R.id.txt_daily_min_temperature);
        }
    }
}