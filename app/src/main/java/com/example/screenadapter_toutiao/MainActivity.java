package com.example.screenadapter_toutiao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenAdapterByToutiao.setCustomDensity(this, getApplication());

        setContentView(R.layout.activity_main);
    }
}
