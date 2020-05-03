package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class overriding extends AppCompatActivity {

    private String or="Overriding";
        private String over="If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.\n" +
                "\n" +
                "In other words, If subclass provides the specific implementation of the method that has been provided by one of its parent class, it is known as method overriding.";

        private  String usage="Usage of Java Method Overriding";

        private String[] ass={"Method overriding is used to provide specific implementation of a method that is already provided by its super class",
                "Method overriding is used for runtime polymorphism"};

        private String rules="Rules for Java Method Overriding";

        private String[] ruu={"Method must have same name as in the parent class\n" ,
                "Method must have same parameter as in the parent class.\n" ,
                "Must be IS-A relationship (inheritance)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overriding);

        TextView t= (TextView)findViewById(R.id.or);
        t.setText(or);
        TextView tt=(TextView)findViewById(R.id.over);
        tt.setText(over);

        TextView us=(TextView)findViewById(R.id.usage);
        us.setText(usage);

        TextView rul=(TextView)findViewById(R.id.rules);
        rul.setText(rules);

        ListView as =(ListView)findViewById(R.id.as);
        ListView ru =(ListView)findViewById(R.id.ru);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.listview,ass);
        as.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.listview,ruu);
        ru.setAdapter(adapter1);

    }
}
