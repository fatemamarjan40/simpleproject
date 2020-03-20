package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class forthActivity extends AppCompatActivity implements View.OnClickListener {
    Button bbbutton;
    Button ssbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        bbbutton = (Button) findViewById(R.id.backButton1);
        bbbutton.setOnClickListener(this);
        ssbutton = (Button) findViewById(R.id.backButton1);
        ssbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back1Intent = new Intent(forthActivity.this, MainActivity.class);
        startActivity(back1Intent);
    }
    public void showMessage(View v) {

        if (v.getId() == R.id.sendButton1) {
            Toast.makeText(forthActivity.this, "your request will be proceed!",Toast.LENGTH_SHORT).show();
        }
    }
}

