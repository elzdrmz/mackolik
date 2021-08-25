package com.eliz.mackolik.ui.news.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.eliz.mackolik.app.data.NewsBO;

public class NewsRecyclerViewDiffCallBack extends DiffUtil.ItemCallback<NewsBO> {
    @Override
    public boolean areItemsTheSame(@NonNull NewsBO oldItem, @NonNull NewsBO newItem) {
        return oldItem == newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull NewsBO oldItem, @NonNull NewsBO newItem) {
        return oldItem.getId().equals(newItem.getId());
    }
}
