package com.akij.app.simple_api_project.adapter.DailyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.DailyForecast.DailySunnyModel;
import java.util.List;

public class DailySunnyAdapter extends RecyclerView.Adapter<DailySunnyAdapter.DailySunnyAdapterViewHolder> {

    private Context context;
    private List<DailySunnyModel> dailySunnyModels;

    public DailySunnyAdapter(Context context, List<DailySunnyModel> dailySunnyModels) {
        this.context = context;
        this.dailySunnyModels = dailySunnyModels;
    }

    @NonNull
    @Override
    public DailySunnyAdapter.DailySunnyAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_sunny_item, parent, false);
        return new DailySunnyAdapter.DailySunnyAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailySunnyAdapter.DailySunnyAdapterViewHolder holder, int position) {
        DailySunnyModel model= dailySunnyModels.get(position);
        holder.txtDailySunrise.setText(model.getSunrise());
        holder.txtDailySunset.setText(model.getSunset());
    }

    @Override
    public int getItemCount() {
        return dailySunnyModels.size();
    }

    public static class DailySunnyAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView txtDailySunrise, txtDailySunset;

        public DailySunnyAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtDailySunrise= itemView.findViewById(R.id.txt_daily_sunrise);
            this.txtDailySunset= itemView.findViewById(R.id.txt_daily_sunset);
        }
    }
}