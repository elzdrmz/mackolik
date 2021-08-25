package com.eliz.mackolik.ui.match.recyclerview;

import android.content.Context;
import android.util.Log;

import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.eliz.mackolik.R;
import com.eliz.mackolik.app.data.MatchBO;
import com.eliz.mackolik.databinding.FragmentMatchItemBinding;

public class MatchesRecyclerViewHolder extends RecyclerView.ViewHolder {

    private FragmentMatchItemBinding binding;
    private Context context;

    public MatchesRecyclerViewHolder(FragmentMatchItemBinding binding, Context context) {
        super(binding.getRoot());
        this.binding = binding;
        this.context = context;
    }

    public void bind(MatchBO match) {
        binding.fragmentMatchItemTeamA.setText(match.getTeam_A().getDisplay_name());
        binding.fragmentMatchItemScore.setText(match.getFts_A() + " - " + match.getFts_B());
        binding.fragmentMatchItemTeamB.setText(match.getTeam_B().getDisplay_name());

        if(getLayoutPosition() % 2 == 0) {
            int res = ResourcesCompat.getColor(context.getResources(), R.color.white, context.getTheme());
            binding.fragmentMatchItemTeamA.setBackgroundColor(res);
            binding.fragmentMatchItemTeamB.setBackgroundColor(res);
        }
    }

}
