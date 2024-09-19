package com.example.hw_3_3month;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_3_3month.databinding.ItemCarBinding;

class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    private TextView tvDesc;
    private ImageView imgCar;


    public CarViewHolder(View binding) {
        super(binding);
        tvName = binding.findViewById(R.id.tv_name);
        tvDesc = binding.findViewById(R.id.tv_desc);
        imgCar = binding.findViewById(R.id.img_car);
    }

    public void onBind(CarModel car) {
        Log.d("CarViewHolder", "Model: " + car.getModel() + ", Desc: " + car.getDesc());
        tvName.setText(car.getModel());
        tvDesc.setText(car.getDesc());
        Glide.with(imgCar).load(car.getImage()).into(imgCar);
    }
}
