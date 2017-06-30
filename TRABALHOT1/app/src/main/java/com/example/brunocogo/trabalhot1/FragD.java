package com.example.brunocogo.trabalhot1;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragD extends Fragment {
private MainActivity principal;
    TextView nota;
    TextView status;
    double mediafinal;
    String mediastring;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_d, container, false);

        // Instanciar Activity
        principal = (MainActivity) getActivity();
        nota = (TextView)v.findViewById(R.id.idnota);
        status=(TextView)v.findViewById(R.id.idstatus);

        nota.setText(principal.mediafinal.toString());

        if (principal.mediafinal>=6)
        {   status.setTextColor(Color.GREEN);
            status.setText("Aprovado");

        }

        else
        {status.setText("Reprovado");
            status.setTextColor(Color.RED);}




        return v;
    }


}
