package com.example.myfirebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonRegister;
    private EditText EditTextEmail;
    private EditText EditTextPassword;
    private EditText EditTextViewSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRegister = (Button) findViewById(R.id.register);
        EditTextEmail=(EditText) findViewById(R.id.Email);
        EditTextPassword = (EditText) findViewById(R.id.Pass);
        buttonRegister =(Button) findViewById(R.id.Signin);
        buttonRegister.setOnClickListener((View.OnClickListener) this);
    }
}

