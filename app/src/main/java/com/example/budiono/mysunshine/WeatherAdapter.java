package com.example.budiono.mysunshine;

/**
 * Created by budiono on 14/01/18.
 */
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.budiono.mysunshine.activity.DetailWeatherActivity;

/**
 * Created by alodokter-arfirman on 14/01/18.
 */

public class WeatherAdapter extends RecyclerView.Adapter implements WeatherViewHolder.WeatherCallback {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(WeatherViewHolder.getWeatherLayout(), parent, false);
        return new WeatherViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public void onWeatherClick(WeatherViewHolder holder) {
        Toast.makeText(holder.itemView.getContext(), "Ini item ke " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();

        //Intent intent = new Intent(holder.itemView.getContext(), DetailWeatherActivity.class);
        Intent intent = new Intent(holder.itemView.getContext(), DetailWeatherActivity.class);
        holder.itemView.getContext().startActivity(intent);


    }
}