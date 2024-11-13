package com.example.formlayoutt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHello) {
            Log.d("MainActivity", "youuuuu again");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }
}
