package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        getSupportActionBar().hide();
    }
}