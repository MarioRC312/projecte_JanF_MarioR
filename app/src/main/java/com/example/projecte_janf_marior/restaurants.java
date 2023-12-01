package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class restaurants extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    //TODO: SPPINER CLASSES RESTAURANTES

    //INFO RESTAURANT
    ImageButton res1, res2, res3, res4, res5, res6;

    //TRUCA RESTAURANT + TORNAR ENRRERA
    Button reserva1, reserva2, reserva3, reserva4, reserva5, reserva6,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        Spinner spinnerRes=(Spinner) findViewById(R.id.spinnerRes);
        spinnerRes.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView)v.findViewById(android.R.id.text1)).setText("");
                    ((TextView)v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount()-1; // you dont display last item. It is used as hint.
            }
        };

        adapter.addAll("Tailandesa","Japonesa","Mediterraneo","Escull el teu restaurant");
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRes.setAdapter(adapter);
        spinnerRes.setSelection(adapter.getCount());


        /*-------------------------------------------------------------*/



        back=findViewById(R.id.backBoton);
        back.setOnClickListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        FragmentManager fm = getSupportFragmentManager();

        /*
        switch (position){
            case 0: fragme iFragment = new PerruqueriesFragment();
                fm.beginTransaction().replace(R.id.business_container,iFragment).commit(); break;
        }*/
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }

    @Override
    public void onClick(View view) {
        //Vista previa restaurants
        ImageButton b = (ImageButton)view;


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