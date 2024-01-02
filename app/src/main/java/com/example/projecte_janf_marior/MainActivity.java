package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton restaurant,hotels,movies,parking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurant=findViewById(R.id.restaurant);
        restaurant.setOnClickListener(this);

        hotels=findViewById(R.id.hoteles);
        hotels.setOnClickListener(this);

        movies=findViewById(R.id.peliculas);
        movies.setOnClickListener(this);

        parking=findViewById(R.id.parking);
        parking.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageButton b = (ImageButton)view;

        if(b.getId() == R.id.restaurant){
            Intent intent = new Intent(this, restaurants.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.hoteles){
            Intent intent = new Intent(this, Hotel.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.peliculas){
            Intent intent = new Intent(this, movies.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.parking){
            Intent intent = new Intent(this, parking.class);
            startActivity(intent);
        }


    }
}