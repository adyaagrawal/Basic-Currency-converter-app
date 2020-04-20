package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        Log.i("info","Button pressed");
        EditText editText=(EditText) findViewById(R.id.editText);
        String rupee=editText.getText().toString();
        double dollars=Double.parseDouble(rupee)*0.013;
        String dollarsString=String.format("%.2f",dollars);
        Toast.makeText(this, "Amount in dollars is $ "+ dollarsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
