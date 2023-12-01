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

    //TORNAR ENRRERA
    Button back;

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
            case 0: fragment_tailandesa tfragment = new fragment_tailandesa();
                    fm.beginTransaction().replace(R.id.contenidorRes,tfragment).commit(); break;
            case 1: fragment_japonesa jfragment = new fragment_japonesa();
                    fm.beginTransaction().replace(R.id.contenidorRes,tfragment).commit(); break;
            case 2: fragment_mediterraneo mfragment = new fragment_mediterraneo();
                    fm.beginTransaction().replace(R.id.contenidorRes,tfragment).commit(); break;
        }*/
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }

    @Override
    public void onClick(View view) {

        Button boto = (Button)view;

        if(boto.getId() == R.id.backBoton){
            Intent intent7 = new Intent(this, MainActivity.class);
            startActivity(intent7);
        }
    }
}