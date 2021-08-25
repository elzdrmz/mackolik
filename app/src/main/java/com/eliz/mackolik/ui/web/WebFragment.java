package com.eliz.mackolik.ui.web;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eliz.mackolik.databinding.FragmentWebBinding;

public class WebFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        FragmentWebBinding binding = FragmentWebBinding.inflate(inflater);
        binding.setLifecycleOwner(this);

        String urlData = WebFragmentArgs.fromBundle(requireArguments()).getUrlData();
        binding.fragmentWebDisplay.loadUrl(urlData);

        return binding.getRoot();
    }
}
