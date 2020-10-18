package com.austen.wanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.austen.wanandroid.databinding.ActivityMainBinding;
import com.flyco.tablayout.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ActivityMainBinding.inflate()
        SlidingTabLayout viewById = findViewById(R.id.bottom_navigation_bar);
    }
}