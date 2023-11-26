package com.example.projecte_janf_marior;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class calendariObert extends AppCompatActivity {

    CalendarView cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendari_obert);
        cal=findViewById(R.id.calendari);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String fecha=dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(calendariObert.this, fecha,Toast.LENGTH_LONG).show();
            }
        });
    }
}