package com.akij.app.simple_api_project.adapter.DailyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.DailyForecast.DailyRainSnowfallModel;
import java.util.List;

public class DailyRainSnowfallAdapter extends RecyclerView.Adapter<DailyRainSnowfallAdapter.DailyRainSnowfallAdapterViewHolder> {

    private Context context;
    private List<DailyRainSnowfallModel> rainSnowfallModels;

    public DailyRainSnowfallAdapter(Context context, List<DailyRainSnowfallModel> rainSnowfallModels) {
        this.context = context;
        this.rainSnowfallModels = rainSnowfallModels;
    }

    @NonNull
    @Override
    public DailyRainSnowfallAdapter.DailyRainSnowfallAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_rain_snow_item, parent, false);
        return new DailyRainSnowfallAdapter.DailyRainSnowfallAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyRainSnowfallAdapter.DailyRainSnowfallAdapterViewHolder holder, int position) {
        DailyRainSnowfallModel model= rainSnowfallModels.get(position);
        holder.txtDailyRain.setText(String.valueOf(model.getRain()));
        holder.txtDailySnowfall.setText(String.valueOf(model.getSnowfall()));
    }

    @Override
    public int getItemCount() {
        return rainSnowfallModels.size();
    }

    public static class DailyRainSnowfallAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView txtDailyRain, txtDailySnowfall;

        public DailyRainSnowfallAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtDailyRain= itemView.findViewById(R.id.txt_daily_rain);
            this.txtDailySnowfall= itemView.findViewById(R.id.txt_daily_snowfall);
        }
    }
}
