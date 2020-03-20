package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class thirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button bbutton;
    Button sbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        bbutton = (Button) findViewById(R.id.backButton);
        bbutton.setOnClickListener(this);
        sbutton = (Button) findViewById(R.id.sendButton);
        sbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent logoutIntent = new Intent(thirdActivity.this, MainActivity.class);
        startActivity(logoutIntent);

    }

    public void showMessage(View v) {

        if (v.getId() == R.id.sendButton) {
Toast.makeText(thirdActivity.this, "your request will be proceed!",Toast.LENGTH_SHORT).show();
        }
    }
}
