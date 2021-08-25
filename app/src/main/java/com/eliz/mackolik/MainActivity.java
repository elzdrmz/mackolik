package com.eliz.mackolik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.eliz.mackolik.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.activityMainAutocomplete.setAdapter(
                new ArrayAdapter<>(
                        this,
                        R.layout.activity_main_drop_down_list_item,
                        new String[] {"News", "Scores", "Standings"}));

        binding.activityMainAutocomplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                switch (index) {
                    case 0:
                        binding.activityMainFragmentContainer.setVisibility(View.GONE);
                        break;

                    case 1:
                        binding.activityMainFragmentContainer.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }
}