package com.example.lab4_appiot_20200839.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab4_appiot_20200839.R;
import com.example.lab4_appiot_20200839.databinding.FragmentAcelerometroBinding;


public class AcelerometroFragment extends Fragment {

    FragmentAcelerometroBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAcelerometroBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}