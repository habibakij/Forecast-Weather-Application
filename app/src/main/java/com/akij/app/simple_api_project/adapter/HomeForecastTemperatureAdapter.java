package com.akij.app.simple_api_project.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.akij.app.simple_api_project.R;
import com.akij.app.simple_api_project.model.HomeTemperatureModel;
import java.util.List;

public class HomeForecastTemperatureAdapter extends RecyclerView.Adapter<HomeForecastTemperatureAdapter.HomeForecastTemperatureAdapterViewHolder> {

    private Context context;
    private List<HomeTemperatureModel> homeTemperatureModels;

    public HomeForecastTemperatureAdapter(Context context, List<HomeTemperatureModel> homeTemperatureModels) {
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
        HomeTemperatureModel model= homeTemperatureModels.get(position);
        holder.txtForecastDate.setText(model.getDate());
        holder.txtForecastTemperature.setText(model.getTemperature());
    }

    @Override
    public int getItemCount() {
        return homeTemperatureModels.size();
    }

    public static class HomeForecastTemperatureAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtForecastDate, txtForecastTemperature;

        public HomeForecastTemperatureAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtForecastDate= itemView.findViewById(R.id.txt_forecast_date);
            this.txtForecastTemperature= itemView.findViewById(R.id.txt_forecast_temperature);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "clicked "+view.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}