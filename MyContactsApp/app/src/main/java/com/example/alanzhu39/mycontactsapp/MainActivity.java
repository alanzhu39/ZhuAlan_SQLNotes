package com.example.alanzhu39.mycontactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyContactApp","MainActivity: setting up layout");
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);
        Log.d("MyContactApp","MainActivity: instantiated DatabaseHelper");
    }
}
