package com.lancefallon.androidgooglemaps.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.lancefallon.androidgooglemaps.R;
import com.lancefallon.androidgooglemaps.fragments.MainFragment;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_map);
        if(mainFragment == null){
            mainFragment = new MainFragment();
            fragmentManager.beginTransaction().add(R.id.container_map, mainFragment).commit();
        }
    }

}
