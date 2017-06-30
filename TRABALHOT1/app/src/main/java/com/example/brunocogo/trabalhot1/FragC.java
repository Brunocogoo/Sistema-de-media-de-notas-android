package com.example.brunocogo.trabalhot1;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;


public class FragC extends Fragment {
private MainActivity principal;

EditText rec;
TextView media;
    Button but;
    TextView teste;
    Double mediadouble;



public View.OnClickListener tapbut = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
            mediadouble= Double.parseDouble(rec.getText().toString());

        Log.d("a","TESTE!"+Double.toString(mediadouble));
        if ((mediadouble<10.1) && (mediadouble>=0)) {
            teste.setTextColor(Color.GREEN);
            teste.setText("OK");
            media.setText("0");

        }
        else {

            teste.setTextColor(Color.RED);
            teste.setText("ERRO - A nota deve estar entre 0 e 10!");
            media.setText("0");
            mediadouble=0.0;



        }
        principal.recnota = mediadouble;

    }
};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_c, container, false);

        // Instanciar Activity
        principal = (MainActivity) getActivity();
        media = (TextView) v.findViewById(R.id.textView5);
        media.setText(principal.media.toString());
        rec = (EditText)v.findViewById(R.id.recupe);
        but = (Button)v.findViewById(R.id.buttonok);
        teste = (TextView)v.findViewById((R.id.teste));
        rec.setText("0");

       // media.setText("0");
        teste.setText("Insira a Nota!");
        if (principal.media>=3 && principal.media <=6)
        {
            rec.setEnabled(true);
            but.setEnabled(true);
            principal.rec=true;

        }
        else {rec.setEnabled(false);
            but.setEnabled(false);
            principal.rec=false;}

        but.setOnClickListener(tapbut);
        return v;
    }


}
