package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;

public class restaurants extends AppCompatActivity implements View.OnClickListener {

    //TODO: SPPINER CLASSES RESTAURANTES

    //INFO RESTAURANT
    ImageButton res1, res2, res3, res4, res5, res6;

    //TRUCA RESTAURANT + TORNAR ENRRERA
    Button reserva1, reserva2, reserva3, reserva4, reserva5, reserva6,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        res1=findViewById(R.id.imgRest1);
        res1.setOnClickListener(this);

        res2=findViewById(R.id.imgRest2);
        res2.setOnClickListener(this);

        res3=findViewById(R.id.imgRest3);
        res3.setOnClickListener(this);

        res4=findViewById(R.id.imgRest4);
        res4.setOnClickListener(this);

        res5=findViewById(R.id.imgRest5);
        res5.setOnClickListener(this);

        res6=findViewById(R.id.imgRest6);
        res6.setOnClickListener(this);

        /*-----------------------------------------------*/

        reserva1=findViewById(R.id.reservaRes1);
        reserva1.setOnClickListener(this);

        reserva2=findViewById(R.id.reservaRes2);
        reserva2.setOnClickListener(this);

        reserva3=findViewById(R.id.reservaRes3);
        reserva3.setOnClickListener(this);

        reserva4=findViewById(R.id.reservaRes4);
        reserva4.setOnClickListener(this);

        reserva5=findViewById(R.id.reservaRes5);
        reserva5.setOnClickListener(this);

        reserva6=findViewById(R.id.reservaRes6);
        reserva6.setOnClickListener(this);

        /*-----------------------------------------------*/

        back=findViewById(R.id.backBoton);
        back.setOnClickListener(this);

        /*
        Glide.with(this)
                .load(urlDeLaImagen)
                .into(Img);
        */
    }

    @Override
    public void onClick(View view) {
        //Vista previa restaurants
        ImageButton b = (ImageButton)view;

        if(b.getId() == R.id.imgRest1){
            Intent intentRes1 = new Intent(this, canForquilla.class);
            startActivity(intentRes1);
        }
        else if(b.getId() == R.id.imgRest2){
            Intent intentRes2 = new Intent(this, tikThai.class);
            startActivity(intentRes2);
        }
        else if(b.getId() == R.id.imgRest3){
            Intent intentRes3 = new Intent(this, kodama.class);
            startActivity(intentRes3);
        }
        else if(b.getId() == R.id.imgRest4){
            Intent intentRes4 = new Intent(this, ostryaCellerFerrer.class);
            startActivity(intentRes4);
        }
        else if(b.getId() == R.id.imgRest5){
            Intent intentRes5 = new Intent(this, nana_japones.class);
            startActivity(intentRes5);
        }
        else if(b.getId() == R.id.imgRest6){
            Intent intentRes6 = new Intent(this, laGranOlla.class);
            startActivity(intentRes6);
        }

        //TRUCAR RESTAURANTS

        Button boto = (Button)view;

        if(boto.getId() == R.id.reservaRes1){
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 42 40 05"));
            startActivity(intent1);
        }
        else if(boto.getId() == R.id.reservaRes2){
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:654 65 01 51"));
            startActivity(intent2);
        }
        else if(boto.getId() == R.id.reservaRes3){
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:934 63 77 56"));
            startActivity(intent3);
        }
        else if(boto.getId() == R.id.reservaRes4){
            Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:936 25 39 13"));
            startActivity(intent4);
        }
        else if(boto.getId() == R.id.reservaRes5){
            Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:931 78 46 62"));
            startActivity(intent5);
        }
        else if(boto.getId() == R.id.reservaRes6){
            Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 79 51 00"));
            startActivity(intent6);
        }
        else if(boto.getId() == R.id.backBoton){
            Intent intent7 = new Intent(this, MainActivity.class);
            startActivity(intent7);
        }
    }
}