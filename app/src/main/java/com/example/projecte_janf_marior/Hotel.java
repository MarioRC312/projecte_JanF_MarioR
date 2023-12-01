package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import  android.widget.Spinner;

import java.util.ArrayList;

public class Hotel extends AppCompatActivity implements View.OnClickListener{
Button back, pagina1;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mifune_neko);

        back=findViewById(R.id.backBoton);
        back.setOnClickListener(this);

        pagina1=findViewById(R.id.b1);
        pagina2=findViewById(R.id.b2);
        pagina.setOnClickListener(this);
        }

    public void onClick(View view) {
        Button boto = (Button)view;

        if(boto.getId() == R.id.backBoton){
            Intent intent1 = new Intent(this, restaurants.class);
            startActivity(intent1);
        }
        else if(boto.getId() == R.id.paginaBoton){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https://www.tripadvisor.es/Restaurant_Review-g670666-d7345411-Reviews-Mifune_Neko_Menjar_Japones-Granollers_Catalonia.html");
            startActivity(intent2);
        }
    }
}
