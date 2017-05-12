package com.iteso.jaimeelmayordomo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextOnce();

    }





    public void changeTextOnce(){
        Button changeTextButton = (Button) findViewById(R.id.button2);
        final TextView changingText = (TextView) findViewById(R.id.editText);
        final TextView changingText2 = (TextView) findViewById(R.id.editText2);
        final TextView changingText3 = (TextView) findViewById(R.id.editText3);
        final TextView changingText4 = (TextView) findViewById(R.id.editText4);


        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
                changingText.setText("Número de la tarjeta: ");
                changingText2.setText("Nombre del titular: ");
                changingText3.setText("Fecha de vencimiento: ");
                changingText4.setText("Número de seguridad: ");

            }
        });
    }


}

