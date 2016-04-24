package com.filipkesteli.widgeti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntents();
    }


    private void initWidgets() {
        tvSecond = (TextView) findViewById(R.id.tvSecond);
    }

    private void handleIntents() {
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.PARAMETER_NAME)) {
            tvSecond.setText(intent.getStringExtra(MainActivity.PARAMETER_NAME));
        }
    }
}
