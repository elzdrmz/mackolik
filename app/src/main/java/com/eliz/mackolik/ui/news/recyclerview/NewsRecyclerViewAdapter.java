package com.eliz.mackolik.ui.news.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.eliz.mackolik.app.data.NewsBO;
import com.eliz.mackolik.databinding.FragmentNewsItemBinding;

public class NewsRecyclerViewAdapter extends ListAdapter<NewsBO, NewsRecyclerViewHolder> {

    private NewsItemClickListener listener;

    public NewsRecyclerViewAdapter(@NonNull DiffUtil.ItemCallback<NewsBO> diffCallback, NewsItemClickListener listener) {
        super(diffCallback);
        this.listener = listener;
    }

    @NonNull
    @Override
    public NewsRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewsRecyclerViewHolder(FragmentNewsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false), parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull NewsRecyclerViewHolder holder, int position) {
        holder.bind(getItem(position));
        holder.itemView.setOnClickListener((l) -> {
            listener.onClick(getItem(position));
        });
    }
}
