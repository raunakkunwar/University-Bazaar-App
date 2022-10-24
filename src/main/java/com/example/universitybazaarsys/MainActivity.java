package com.example.universitybazaarsys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Sales, Buy, Exchange, Homescren;


        Sales = (Button)findViewById(R.id.button);
        Buy = (Button)findViewById(R.id.button2);
        Exchange = (Button)findViewById(R.id.button3);
        Homescren = (Button)findViewById(R.id.button4);

        Sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), SalesPage.class);
                        startActivity(intent1);
            }
        });


        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), BuyPage.class);
                startActivity(intent1);
            }
        });

        Exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), ExchangePage.class);
                startActivity(intent1);
            }
        });

        Homescren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), HomescreenPage.class);
                startActivity(intent1);
            }
        });

    }
}







