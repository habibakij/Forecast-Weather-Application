package com.akij.app.simple_api_project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.HomeHourlyModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeHourlyAdapter extends RecyclerView.Adapter<HomeHourlyAdapter.HomeHourlyAdapterViewHolder> {

    private Context context;
    private List<HomeHourlyModel> homeHourlyModels;

    public HomeHourlyAdapter(Context context, List<HomeHourlyModel> homeHourlyModels) {
        this.context = context;
        this.homeHourlyModels = homeHourlyModels;
    }

    @NonNull
    @Override
    public HomeHourlyAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_hourly_item, parent, false);
        return new HomeHourlyAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHourlyAdapterViewHolder holder, int position) {
        HomeHourlyModel model= homeHourlyModels.get(position);
        holder.txtHourlyName.setText(model.getName());
        holder.txtHourlyValue.setText(model.getValue());
        Picasso.get().load(model.getImage()).into(holder.imgHourly);
    }

    @Override
    public int getItemCount() {
        return homeHourlyModels.size();
    }

    public static class HomeHourlyAdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView imgHourly;
        TextView txtHourlyName, txtHourlyValue;

        public HomeHourlyAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgHourly= itemView.findViewById(R.id.img_hourly_item);
            this.txtHourlyName= itemView.findViewById(R.id.txt_hourly_name);
            this.txtHourlyValue= itemView.findViewById(R.id.txt_hourly_value);
        }
    }
}