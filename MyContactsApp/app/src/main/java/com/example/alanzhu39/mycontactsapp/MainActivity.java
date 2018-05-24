package com.example.alanzhu39.mycontactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;
    EditText editName;
    EditText editPhone;
    EditText editAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyContactApp","MainActivity: setting up layout");
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editText_name);
        editPhone = findViewById(R.id.editText_phone);
        editAddress = findViewById(R.id.editText_address);

        myDB = new DatabaseHelper(this);
        Log.d("MyContactApp","MainActivity: instantiated DatabaseHelper");
    }

    public void addData(View view) {
        Log.d("MyContactApp","MainActivity: add contact button pressed");
        boolean isInserted = myDB.insertData(editName.getText().toString(),editPhone.getText().toString(),editAddress.getText().toString());
        if(isInserted) {
            Toast.makeText(MainActivity.this,"Success - contact inserted", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Failed - contact not inserted", Toast.LENGTH_LONG).show();
        }
    }


}
