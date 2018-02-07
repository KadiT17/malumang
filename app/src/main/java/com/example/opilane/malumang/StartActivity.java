package com.example.opilane.malumang;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {
    Button alusta;
    EditText nimi1, nimi2;
    SharedPreferences sharePre

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}
