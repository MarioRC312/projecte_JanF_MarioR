package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class parking extends AppCompatActivity implements View.OnClickListener{

    Button park1,park2,park3,park4,park5,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        park1=findViewById(R.id.numPrk1);
        park1.setOnClickListener(this);

        park2=findViewById(R.id.numPrk2);
        park2.setOnClickListener(this);

        park3=findViewById(R.id.numPrk3);
        park3.setOnClickListener(this);

        park3=findViewById(R.id.numPrk3);
        park3.setOnClickListener(this);

        park4=findViewById(R.id.numPrk4);
        park4.setOnClickListener(this);

        park5=findViewById(R.id.numPrk5);
        park5.setOnClickListener(this);

        back=findViewById(R.id.backButton);
        back.setOnClickListener(this);
    }
    

    @Override
    public void onClick(View view) {
        Button boto = (Button)view;

        if(boto.getId() == R.id.numPrk1){
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 60 66 90"));
            startActivity(intent1);
        }
        else if (boto.getId() == R.id.numPrk2){
            Toast missatge = Toast.makeText(this, "Aquest Parking no te telèfon",Toast.LENGTH_SHORT);
            missatge.show();
        }
        else if (boto.getId() == R.id.numPrk3){
            Toast missatge = Toast.makeText(this, "Aquest Parking no te telèfon",Toast.LENGTH_SHORT);
            missatge.show();
        }
        else if (boto.getId() == R.id.numPrk4){
            Toast missatge = Toast.makeText(this, "Aquest Parking no te telèfon",Toast.LENGTH_SHORT);
            missatge.show();
        }
        else if (boto.getId() == R.id.numPrk5){
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 42 66 10"));
            startActivity(intent2);
        }
        else if (boto.getId() == R.id.backButton){
            Intent intent3 = new Intent(this, MainActivity.class);
            startActivity(intent3);
        }
    }
}