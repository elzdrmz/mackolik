package com.eliz.mackolik.ui.match.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.eliz.mackolik.app.data.MatchBO;
import com.eliz.mackolik.databinding.FragmentMatchItemBinding;

public class MatchesRecyclerViewAdapter extends ListAdapter<MatchBO, MatchesRecyclerViewHolder> {
    public MatchesRecyclerViewAdapter(@NonNull DiffUtil.ItemCallback<MatchBO> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public MatchesRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MatchesRecyclerViewHolder(FragmentMatchItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false), parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesRecyclerViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

}
