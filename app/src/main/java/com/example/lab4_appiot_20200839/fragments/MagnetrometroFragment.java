package com.example.lab4_appiot_20200839.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab4_appiot_20200839.R;
import com.example.lab4_appiot_20200839.databinding.FragmentAcelerometroBinding;
import com.example.lab4_appiot_20200839.databinding.FragmentMagnetrometroBinding;


public class MagnetrometroFragment extends Fragment {

    FragmentMagnetrometroBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMagnetrometroBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}