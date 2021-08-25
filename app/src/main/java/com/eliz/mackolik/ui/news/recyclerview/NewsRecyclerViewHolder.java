package com.eliz.mackolik.ui.news.recyclerview;

import android.content.Context;
import android.net.Uri;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.eliz.mackolik.app.data.NewsBO;
import com.eliz.mackolik.databinding.FragmentNewsItemBinding;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class NewsRecyclerViewHolder extends RecyclerView.ViewHolder {

    private FragmentNewsItemBinding binding;
    private Context context;

    public NewsRecyclerViewHolder(FragmentNewsItemBinding binding, Context context) {
        super(binding.getRoot());
        this.binding = binding;
        this.context = context;
    }

    public void bind(NewsBO news) {
        binding.fragmentNewsItemTitle.setText(news.getTitle());
        binding.fragmentNewsItemDate.setText(news.getDate());
        Glide.with(context).load(news.getPicUrl()).into(binding.fragmentNewsItemImage);
    }
}
