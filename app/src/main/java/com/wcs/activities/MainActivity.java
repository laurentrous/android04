package com.wcs.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textview = findViewById(R.id.login);
                Intent message = new Intent(MainActivity.this, HomeActivity.class);
                String log = textview.getText().toString();
                message.putExtra("LOGIN", log);
                startActivity(message);

            }
        });
    }
}
