package com.example.brunocogo.trabalhot1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragmentoa).commit();
    }

FragA fragmentoa = new FragA();
    FragB fragmentob = new FragB();
    FragC fragmentoc = new FragC();
    FragD fragmentod = new FragD();
    Double nota1=0.0;
    Double nota2=0.0;
    Double media=0.0;
    Double mediafinal=0.0;
    boolean rec=false;
    Double recnota=1.0;


    public void clique1 (View view)
    {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragmentoa).commit();


    }

    public void clique2 (View view)
    {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragmentob).commit();


    }

    public void clique3 (View view)
    {
        media=((nota1+nota2)/2);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragmentoc).commit();


    }

    public void clique4 (View view)
    {
        if (rec==true) {
            mediafinal = ((media + recnota) / 2);
            Log.d("state", "VERDADEIRO ");
        }
        if (rec==false)
        {

            mediafinal=media;
            Log.d("state", "FALSO");


        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragmentod).commit();


    }
}
