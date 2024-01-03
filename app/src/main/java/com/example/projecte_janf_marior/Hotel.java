package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import  android.widget.Spinner;

import java.util.ArrayList;

public class Hotel extends AppCompatActivity implements View.OnClickListener{

    Button back, web1,web2,web3,web4,web5,web6,tel1,tel2,tel3,tel4,tel5,tel6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        back = findViewById(R.id.backBoton);
        back.setOnClickListener(this);

        web1.findViewById(R.id.b1);
        tel1.findViewById(R.id.b2);
        web2.findViewById(R.id.b3);
        tel2.findViewById(R.id.b4);
        web3.findViewById(R.id.b5);
        tel3.findViewById(R.id.b6);
        web4.findViewById(R.id.b7);
        tel4.findViewById(R.id.b8);
        web5.findViewById(R.id.b9);
        tel5.findViewById(R.id.b10);
        web6.findViewById(R.id.b11);
        tel6.findViewById(R.id.b12);

        web1.setOnClickListener(this);
        tel1.setOnClickListener(this);
        web2.setOnClickListener(this);
        tel2.setOnClickListener(this);
        web3.setOnClickListener(this);
        tel3.setOnClickListener(this);
        web4.setOnClickListener(this);
        tel4.setOnClickListener(this);
        web5.setOnClickListener(this);
        tel5.setOnClickListener(this);
        web6.setOnClickListener(this);
        tel6.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        //aquests botons permeten trucar per telefon al hotel i anar a la pagina web del hotel

        Button boto = (Button)view;

        if(boto.getId() == R.id.backBoton){
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
        }
        else if(boto.getId() == R.id.b1){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https://www.hotel-bb.com");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b2)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 40 71 32"));
            startActivity(intent2);

        }
        else if(boto.getId() == R.id.b3){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https://www.hotelciutatgranollers.com");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b4)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 62 20"));
            startActivity(intent2);

        }
        else if(boto.getId() == R.id.b5){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https:/www.fondaeuropa.eu.");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b6)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 70 03 12"));
            startActivity(intent2);

        }
        else if(boto.getId() == R.id.b7){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https:/www.hotelh.es");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b8)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 60 66 88"));
            startActivity(intent2);

        }
        else if(boto.getId() == R.id.b9){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https://www.hotelgranollers.com");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b10)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 51 00"));
            startActivity(intent2);

        }
        else if(boto.getId() == R.id.b11){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https:// www.hoteliris.com");
            startActivity(intent2);
        }
        else if(boto.getId()==R.id.b12)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 29 29"));
            startActivity(intent2);

        }
    }
}