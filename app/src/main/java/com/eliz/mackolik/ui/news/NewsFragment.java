package com.eliz.mackolik.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.eliz.mackolik.app.data.NewsBO;
import com.eliz.mackolik.databinding.FragmentNewsBinding;
import com.eliz.mackolik.ui.news.recyclerview.NewsItemClickListener;
import com.eliz.mackolik.ui.news.recyclerview.NewsRecyclerViewAdapter;
import com.eliz.mackolik.ui.news.recyclerview.NewsRecyclerViewDiffCallBack;

public class NewsFragment extends Fragment implements NewsItemClickListener {

    private NewsViewModel viewModel;
    private FragmentNewsBinding binding;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = FragmentNewsBinding.inflate(inflater);
        binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        binding.setViewModel(viewModel);

        viewModel.fetchData();
        binding.fragmentNewsRecyclerview.setAdapter(new NewsRecyclerViewAdapter(new NewsRecyclerViewDiffCallBack(), this));

        viewModel.getData().observe(this.getViewLifecycleOwner(), newsBOS -> {
            ((NewsRecyclerViewAdapter) binding.fragmentNewsRecyclerview.getAdapter()).submitList(newsBOS);
        });
        return binding.getRoot();
    }

    @Override
    public void onClick(NewsBO newsBO) {
        Navigation.findNavController(requireView()).navigate((NavDirections) NewsFragmentDirections.actionNewsFragmentToWebFragment(newsBO.getLink()));
    }
}
