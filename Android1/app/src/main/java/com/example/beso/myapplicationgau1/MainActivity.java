package com.example.beso.myapplicationgau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.buttonTest);

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tx = (TextView) findViewById(R.id.textView_1);
                tx.setText("Hello GAU");
            }
        });
    }
}
