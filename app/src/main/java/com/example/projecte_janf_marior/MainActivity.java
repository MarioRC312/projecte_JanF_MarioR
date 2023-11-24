package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton negoci, restaurant,hotels,movies,parking,events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        negoci=findViewById(R.id.negoci);
        negoci.setOnClickListener(this);

        restaurant=findViewById(R.id.restaurant);
        restaurant.setOnClickListener(this);

        hotels=findViewById(R.id.hotels);
        hotels.setOnClickListener(this);

        movies=findViewById(R.id.movies);
        movies.setOnClickListener(this);

        parking=findViewById(R.id.parking);
        parking.setOnClickListener(this);

        events=findViewById(R.id.events);
        events.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageButton b = (ImageButton)view;

        if(b.getId() == R.id.negoci){
            Intent intent = new Intent(this, business.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.restaurant){
            Intent intent = new Intent(this, restaurants.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.hotels){
            Intent intent = new Intent(this, hotels2.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.movies){
            Intent intent = new Intent(this, movies.class);
            startActivity(intent);
        }
        /*else if(b.getId() == R.id.parking){
            Intent intent = new Intent(this, parking.class);
            startActivity(intent);
        }
        else if(b.getId() == R.id.events){
            Intent intent = new Intent(this, events.class);
            startActivity(intent);
        }*/

    }
}