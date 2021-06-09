package com.example.weatherapiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //widgets initalization
    Button btn_CityId, btn_WeatherById , btn_WeatherByName;
    EditText et_dataInput;
    ListView lv_weatherReport;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //values to widgets
        btn_CityId = findViewById(R.id.btn_getCityById);
        btn_WeatherById = findViewById(R.id.btn_WeatherByCityId);
        btn_WeatherByName = findViewById(R.id.btn_getWeatherByCityName);

        et_dataInput = findViewById(R.id.et_dataInput);
        lv_weatherReport = findViewById(R.id.lv_weatherReports);

        //event listeners 
        btn_CityId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainActivity.this, "you cliked me1", Toast.LENGTH_SHORT ).show();
            }
        });

        btn_WeatherById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainActivity.this, "you cliked me2", Toast.LENGTH_SHORT ).show();
            }
        });

        btn_WeatherByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainActivity.this, "you cliked me3", Toast.LENGTH_SHORT ).show();
            }
        });


    }

}