package com.eliz.mackolik.ui.match.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.eliz.mackolik.app.data.MatchBO;

public class MatchesRecyclerViewDiffCallBack extends DiffUtil.ItemCallback<MatchBO> {
    @Override
    public boolean areItemsTheSame(@NonNull MatchBO oldItem, @NonNull MatchBO newItem) {
        return oldItem == newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull MatchBO oldItem, @NonNull MatchBO newItem) {
        return oldItem.getId().equals(newItem.getId());
    }
}
