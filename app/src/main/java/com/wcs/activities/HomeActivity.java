package com.wcs.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String login = intent.getStringExtra("LOGIN");

        Toast.makeText(HomeActivity.this, login, Toast.LENGTH_SHORT).show();


    }
}
