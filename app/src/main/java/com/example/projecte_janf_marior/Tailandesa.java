package com.example.projecte_janf_marior;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/*
 * A simple {@link Fragment} subclass.
 * Use the {@link Tailandesa#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tailandesa extends Fragment implements View.OnClickListener {

    ImageButton res1, res2, res3;
    Button reserva1, reserva2, reserva3;

    /*
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    */
    public Tailandesa() {
        // Required empty public constructor
    }
    /*
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tailandesa.

    // TODO: Rename and change types and number of parameters
    public static Tailandesa newInstance(String param1, String param2) {
        Tailandesa fragment = new Tailandesa();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //No he pogut aconseguir que els fragments és transferissin als activitys que havia creat
    //La meva intenció era que al polsa el botó l'usuari anés a la pàgina corresponent amb el restaurant que ha escollit
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        res1 = (ImageButton) getView().findViewById(R.id.imgRest1);
        res1.setOnClickListener(this);

        res2 = (ImageButton) getView().findViewById(R.id.imgRest2);
        res2.setOnClickListener(this);

        res3 = (ImageButton) getView().findViewById(R.id.imgRest3);
        res3.setOnClickListener(this);

        reserva1= (Button) getView().findViewById(R.id.reservaRes1);
        reserva1.setOnClickListener(this);

        reserva2= (Button) getView().findViewById(R.id.reservaRes2);
        reserva2.setOnClickListener(this);

        reserva3= (Button) getView().findViewById(R.id.reservaRes3);
        reserva3.setOnClickListener(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tailandesa, container, false);
    }

    @Override
    public void onClick(View view) {

        ImageButton b = (ImageButton)view;

        if(b.getId() == R.id.imgRest1){
            //Intent intentRes1 = new Intent(this, tikThai.class);
            //startActivity(intentRes1);
        }
        else if (b.getId() == R.id.imgRest2){
            //Intent intentRes2 = new Intent(this, leks_thai.class);
            //startActivity(intentRes2);
        }
        else if (b.getId() == R.id.imgRest3){
            //Intent intentRes2 = new Intent(this, pure_cuisine.class);
            //startActivity(intentRes2);
        }

        Button boto = (Button)view;

        if(boto.getId() == R.id.reservaRes1){
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:654 65 01 51"));
            startActivity(intent1);
        }
        else if(boto.getId() == R.id.reservaRes2){
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:654 65 01 51"));
            startActivity(intent2);
        }
        else if(boto.getId() == R.id.reservaRes3){
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938 35 21 56"));
            startActivity(intent3);
        }

    }
}