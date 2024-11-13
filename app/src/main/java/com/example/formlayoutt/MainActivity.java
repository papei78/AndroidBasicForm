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
    public void onRegisterBtnClick(View view){
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);


        EditText editTextName= findViewById(R.id.editTextName);
        EditText editTextLastName= findViewById(R.id.editTextLastName);
        EditText editTextEmail= findViewById(R.id.editTextEmail);

        txtName.setText("First Name: "  + editTextName.getText().toString());
        txtLastName.setText("Last Name: "  + editTextLastName.getText().toString());
        txtEmail.setText("Email: "  + editTextEmail.getText().toString());

    }

}