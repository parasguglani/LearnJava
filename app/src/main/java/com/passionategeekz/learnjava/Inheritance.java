package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Inheritance extends AppCompatActivity {

    private String Inh="Inheritance ";
    private  String inhdata="Inheritance in Java refers to accessing methods and variables of super class in a sub class object/class. In simple terms we can say “an object acquires attributes and methods of another object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        TextView t = (TextView)findViewById(R.id.Inh);
        TextView t1 = (TextView)findViewById(R.id.inhdata);

        t.setText(Inh);
        t1.setText(inhdata);



    }
}
