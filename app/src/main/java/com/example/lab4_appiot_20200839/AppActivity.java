package com.example.lab4_appiot_20200839;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab4_appiot_20200839.databinding.ActivityAppBinding;
import com.example.lab4_appiot_20200839.services.TypicodeServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppActivity extends AppCompatActivity {

    TypicodeServices typicodeService;
    ActivityAppBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        typicodeService = new Retrofit.Builder()
                .baseUrl("https://randomuser.me")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TypicodeServices.class);

    }
}