package com.example.lab4_appiot_20200839.services;

import com.example.lab4_appiot_20200839.dto.Profile;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TypicodeServices {

    @GET("/api/")
        Call<Profile> getResult();
}
