package com.example.beso.testapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Call extends AppCompatActivity {

    TextView tv = (TextView)findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }


    @SuppressLint("MissingPermission")
    public void call(View v){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + tv.getText()));
        startActivity(intent);
    }

    public void back(View v){
        setContentView(R.layout.activity_main);
    }
}
