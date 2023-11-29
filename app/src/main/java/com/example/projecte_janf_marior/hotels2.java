package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import  android.widget.Spinner;

import java.util.ArrayList;

public class hotels2 extends AppCompatActivity {

    Spinner spinner;
    Button boto;

    RelativeLayout r1,r2,r3,r4,r5,r6;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels2);
        spinner=findViewById(R.id.spinner);
        boto=findViewById(R.id.boto);
        r1=findViewById(R.id.Re1);

        r1.setVisibility(View.INVISIBLE);



        omplirSpinner();
        boto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarHotels();
            }
        });


    }

    private void mostrarHotels() {

        Hotels hotel =(Hotels) spinner.getSelectedItem();
    }

    private void omplirSpinner() {

        ArrayList<Hotels> hotels=new ArrayList<>();
        hotels.add(new Hotels("Té 5 estrelles "));
        hotels.add(new Hotels("Té 4 estrelles"));
        hotels.add(new Hotels("Té 3 estrelles"));
        hotels.add(new Hotels("Té 2 estrelles"));


        ArrayAdapter<Hotels> adapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,hotels);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}