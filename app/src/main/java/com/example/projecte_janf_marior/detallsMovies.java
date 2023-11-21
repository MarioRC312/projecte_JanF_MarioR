package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class detallsMovies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalls_movies);

        TextView titulo=(TextView) findViewById(R.id.tvTitulo2);
        TextView detalls= (TextView) findViewById(R.id.tvDescripcion2);

        Intent intent=getIntent();
        Bundle b=intent.getExtras();

        if(b!=null)
        {
            titulo.setText(b.getString("TIT"));
            titulo.setText(b.getString("DET"));
        }
    }
}
