package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class arrayy extends AppCompatActivity {

    private  String array = "An array is a group of like-typed variables that are referred to by a common name.Arrays in Java work differently than they do in C/C++.";
   private ListView v;
   String data[]={"In Java all arrays are dynamically allocated","A Java array variable can also be declared like other variables with [] after the data type",
    "The variables in the array are ordered and each have an index beginning from 0",
    "Java array can be also be used as a static field, a local variable or a method parameter",
    "The size of an array must be specified by an int value and not long or short",
    "The direct superclass of an array type is Object",
    "Every array type implements the interfaces Cloneable and java.io.Serializable",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrayy);


        TextView t =(TextView)findViewById(R.id.array);
        t.setText(array);

      ListView l=(ListView)findViewById(R.id.lll);
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listview,data);
      l.setAdapter(adapter);

    }
}
