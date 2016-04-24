package com.filipkesteli.widgeti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_NAME = "com.filipkesteli.widgeti2.PARAMETER";

    private EditText etNumberPassword;
    private EditText etPhone;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }


    private void initWidgets() {
        etNumberPassword = (EditText) findViewById(R.id.etNumberPassword);
        etPhone = (EditText) findViewById(R.id.etPhone);
        btnSend = (Button) findViewById(R.id.btnSend);
    }

    private void setupListeners() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iSend();
            }
        });
    }

    private void iSend() {
        //explicite intent:
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(PARAMETER_NAME, "PASSWORD: " + etNumberPassword.getText().toString()
                + " PHONE: " + etPhone.getText().toString());
        startActivity(intent);
    }
}
