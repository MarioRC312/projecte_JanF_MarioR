package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class canForquilla extends AppCompatActivity implements View.OnClickListener{

    Button back, pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_forquilla);

        back=findViewById(R.id.backBoton);
        back.setOnClickListener(this);

        pagina=findViewById(R.id.paginaBoton);
        pagina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Button boto = (Button)view;

        if(boto.getId() == R.id.backBoton){
            Intent intent1 = new Intent(this, restaurants.class);
            startActivity(intent1);
        }
        else if(boto.getId() == R.id.paginaBoton){
            Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent2.putExtra(SearchManager.QUERY, "https://www.tripadvisor.es/Restaurant_Review-g1934194-d4724147-Reviews-Can_Forquilla-Vilanova_del_Valles_Granollers_Catalonia.html");
            startActivity(intent2);
        }

    }
}