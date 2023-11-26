package com.example.projecte_janf_marior;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class calendariEvents extends AppCompatActivity {

    Button abrirCalendario;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendari_events);

        abrirCalendario=findViewById(R.id.boton);
        tv=findViewById(R.id.texto);

    }


    public void abrirCalendari(View view) {

        Intent intent1=new Intent(this, calendariObert.class);
        startActivity(intent1);

        Calendar cal = Calendar.getInstance();
        int any = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd =new DatePickerDialog(calendariEvents.this,R.style.FonsColorClaendari,new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth + "/" + month + "/" + year;
                tv.setText(fecha);
            }
        },2023,mes,dia); dpd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        dpd.show();
    }

    public void abrirHora(View view) {
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        TimePickerDialog tmd = new TimePickerDialog(calendariEvents.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int horaDia, int minutDia) {
                tv.setText(horaDia + ":" + minutDia);
            }
        },0, 0, false);
        tmd.show();
    }
}