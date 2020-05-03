package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class objclas extends AppCompatActivity {

    private String obj="Objects";
    private  String data="Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors – wagging the tail, barking, eating. An object is an instance of a class.";
    private String objdata="An object has three characteristics:\n" +
            "\n" +
            "State: represents the data (value) of an object.\n" +
            "Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.\n" +
            "Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.";
    private  String clasdata="A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.";
    private  String classs="Class";
    private  String Classdatamore="A class is a blueprint for the object.\n" +
            "\n" +
            "We can think of the class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.\n" +
            "\n" +
            "Since many houses can be made from the same description, we can create many objects from a class.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objclas);

        TextView objj =(TextView)findViewById(R.id.obj);
        TextView dataa =(TextView)findViewById(R.id.data);
        TextView objdataa =(TextView)findViewById(R.id.objdata);
        TextView classsa =(TextView)findViewById(R.id.classs);
        TextView clasdataa =(TextView)findViewById(R.id.clasdata);
        TextView Classdatamorea =(TextView)findViewById(R.id.Classdatamore);

        objj.setText(obj);
        dataa.setText(data);
        objdataa.setText(objdata);
        classsa.setText(classs);
        clasdataa.setText(clasdata);
        Classdatamorea.setText(Classdatamore);

    }
}
