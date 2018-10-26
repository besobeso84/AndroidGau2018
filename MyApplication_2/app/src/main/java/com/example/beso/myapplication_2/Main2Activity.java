package com.example.beso.myapplication_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("App2 - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("App2 - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("App2 - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("App2 - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("App2 - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("App2 - onDestroy");
    }
}
