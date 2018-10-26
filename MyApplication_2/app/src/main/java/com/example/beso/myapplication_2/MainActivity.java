package com.example.beso.myapplication_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void slideSecendActivity(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("App - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("App - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("App - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("App - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("App - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("App - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("App - onDestroy");
    }
}
