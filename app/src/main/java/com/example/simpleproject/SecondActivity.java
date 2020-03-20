package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                Intent loginIntent = new Intent(SecondActivity.this, thirdActivity.class);
                startActivity(loginIntent);
                break;
            case R.id.button2:
                Intent NetIntent = new Intent(SecondActivity.this,forthActivity.class);
                startActivity(NetIntent);
                break;
            case R.id.button3:
                Intent loanIntent = new Intent(SecondActivity.this, fifthActivity.class);
                startActivity(loanIntent);
                break;

        }

    }
}
