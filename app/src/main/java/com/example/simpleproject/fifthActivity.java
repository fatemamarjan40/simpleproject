package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toast;


public class fifthActivity extends AppCompatActivity implements View.OnClickListener {
    Button bbbbutton;
    Button sssbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        bbbbutton = (Button) findViewById(R.id.backButton2);
        bbbbutton.setOnClickListener(this);
        sssbutton = (Button) findViewById(R.id.backButton2);
        sssbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back2Intent = new Intent(fifthActivity.this, MainActivity.class);
        startActivity(back2Intent);
    }
    public void showMessage(View v) {

        if (v.getId() == R.id.sendButton2) {
            Toast.makeText(fifthActivity.this, "your request will be proceed!",Toast.LENGTH_SHORT).show();
        }
    }
}
