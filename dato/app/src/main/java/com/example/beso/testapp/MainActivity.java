package com.example.beso.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnClick(View v) {

        switch (v.getId()){
            case R.id.call:
                setContentView(R.layout.activity_call);
                break;
            case R.id.share:
                setContentView(R.layout.activity_share);
                break;
            case R.id.map:
                setContentView(R.layout.activity_maps);
                break;
        }

    }


}
