package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bbbbbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbbbbutton = (Button) findViewById(R.id.enterid);
        bbbbbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent enterIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(enterIntent);

    }
}
