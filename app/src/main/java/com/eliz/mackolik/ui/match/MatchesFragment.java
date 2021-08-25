package com.eliz.mackolik.ui.match;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.eliz.mackolik.app.data.MatchBO;
import com.eliz.mackolik.databinding.FragmentMatchesBinding;
import com.eliz.mackolik.ui.match.recyclerview.MatchesRecyclerViewAdapter;
import com.eliz.mackolik.ui.match.recyclerview.MatchesRecyclerViewDiffCallBack;

import java.util.List;

public class MatchesFragment extends Fragment {

    private MatchesViewModel viewModel;
    private FragmentMatchesBinding binding;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = FragmentMatchesBinding.inflate(inflater);
        binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(MatchesViewModel.class);
        binding.setViewModel(viewModel);

        viewModel.fetchData();
        binding.fragmentMatchesRecyclerView.setAdapter(new MatchesRecyclerViewAdapter(new MatchesRecyclerViewDiffCallBack()));

        viewModel.getData().observe(this.getViewLifecycleOwner(), newMatches -> {
            ((MatchesRecyclerViewAdapter) binding.fragmentMatchesRecyclerView.getAdapter()).submitList(newMatches);
        });

        return binding.getRoot();
    }
}
