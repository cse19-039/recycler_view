package com.example.recycler_view_week5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MegaPixelModel> megaPixelModels = new ArrayList<>();

    int[] megaPixelImages = {R.drawable.ic_baseline_11mp_24, R.drawable.ic_baseline_12mp_24,
            R.drawable.ic_baseline_13mp_24, R.drawable.ic_baseline_14mp_24, R.drawable.ic_baseline_15mp_24,
            R.drawable.ic_baseline_16mp_24, R.drawable.ic_baseline_17mp_24, R.drawable.ic_baseline_18_up_rating_24,
            R.drawable.ic_baseline_19mp_24, R.drawable.ic_baseline_20mp_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.MpRecyclerView);

        setUpmegaPixelModels();

        MP_RecyclerViewAdapter adapter = new MP_RecyclerViewAdapter(this, megaPixelModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpmegaPixelModels(){
        String[] megaPixelFullNames = getResources().getStringArray(R.array.megapixel_full_name);
        String[] megaPixelNumberNames = getResources().getStringArray(R.array.megapixel_number_name);
        String[] megaPixelAbbreviatedNames = getResources().getStringArray(R.array.megapixel_abbreviation_name);

        for (int i = 0; i<megaPixelFullNames.length; i++){
            megaPixelModels.add(new MegaPixelModel(megaPixelFullNames[i],
                    megaPixelNumberNames[i], megaPixelAbbreviatedNames[i],
                    megaPixelImages[i]));
        }
    }
}