package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class polymor extends AppCompatActivity {

    private String pol="Polymorphism";
    private String poldef="Polymorphism means having many forms. In Java, polymorphism allows us to access an object in multiple ways, such as";
    String[] a={"When an object is accessed by using the reference variable of its own class" ,
            "When an object is accessed by using the reference variable of its superclass"};
    private  String types="types of polymorphism ";
    String[] b={"Compile-time polymorphism" ,
            "Runtime polymorphism."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymor);

        TextView t= (TextView)findViewById(R.id.pol);
        TextView tt=(TextView)findViewById(R.id.poldef);

        t.setText(pol);
        tt.setText(poldef);

        ListView l=(ListView)findViewById(R.id.ll);
        ListView i= (ListView)findViewById(R.id.hh);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listview,a);
        l.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.listview,b);
        i.setAdapter(adapter1);



    }
}
