package com.example.www.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t2;
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t2 = (TextView)findViewById(R.id.t2);
        b1 = (Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("You clicked Button1");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("You clicked Button3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText("You clicked Button4");
            }
        });



    }
    public void cb2(View v){
        t2.setText("You clicked button2");
    }




    @Override
    public void onClick(View v) {

    }
}
