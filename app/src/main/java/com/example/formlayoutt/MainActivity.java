package com.example.formlayoutt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void onHelloBtnClick(View view){
        TextView txtName = findViewById(R.id.textWellkommen);

        txtName.setText("You're not welcome in here" );


    }

}