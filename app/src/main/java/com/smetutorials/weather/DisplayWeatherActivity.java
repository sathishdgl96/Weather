package com.smetutorials.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayWeatherActivity extends AppCompatActivity
{
    TextView city_field, updated_on;
    TextView weather_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_weather);
        city_field=findViewById(R.id.city_field);
        updated_on=findViewById(R.id.updated_field);
        weather_icon=findViewById(R.id.weather_icon);
        city_field.setText(getIntent().getStringExtra("city"));
        updated_on.setText("12/02/2020");
        weather_icon.setText(getIntent().getStringExtra("temperature"));
    }
}