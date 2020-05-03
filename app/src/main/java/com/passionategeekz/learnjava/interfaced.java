package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class interfaced extends AppCompatActivity {

    private String inter="Interface";
    private  String interfacdata="Interface is a way to implement dynamic binding or polymorphism. Interface defines set of methods as a contract. The class that is implementing this interface must implement these functionalities in the concrete class.\n" +
            "\n" +
            "The interfaces adds value when you are building a larger system or a library.";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaced);
    }
}
