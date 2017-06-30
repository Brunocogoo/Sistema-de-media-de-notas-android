package com.example.brunocogo.trabalhot1;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.renderscript.Double2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FragB extends Fragment {
private MainActivity principal;


EditText textonota1;
    double n1,n2;

    Button botao;

    EditText  textonota2;
    TextView menssagem;


    public OnClickListener tapGuarda = new OnClickListener() {
        @Override
        public void onClick(View v) {


            n1 = Double.parseDouble(textonota1.getText().toString());
          n2 = Double.parseDouble(textonota2.getText().toString());



            if ((n2<10.1 && n1>=0)&&(n1<10.1 && n1>=0)) {
                menssagem.setTextColor(Color.GREEN);
                menssagem.setText("OK");
                textonota1.setText("0");
                textonota2.setText("0");
            }
            else {

                menssagem.setTextColor(Color.RED);
                menssagem.setText("ERRO - A nota deve estar entre 0 e 10!");
                textonota1.setText("0");
                textonota1.setText("0");
                n1=0;
                n2=0;
            }


            principal.nota1=n1;
            principal.nota2=n2;



        }
    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_b, container, false);

        // Instanciar Activity
        principal = (MainActivity) getActivity();
        textonota1 = (EditText)v.findViewById(R.id.nota1);
        textonota2 = (EditText)v.findViewById(R.id.nota2);

        menssagem = (TextView) v.findViewById(R.id.msg);
        botao = (Button)v.findViewById(R.id.button2);

        textonota1.setText("0");
        textonota2.setText("0");

        botao.setOnClickListener(tapGuarda);
        return v;
    }


}
