package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class abstraction extends AppCompatActivity {

    private String ab="Abtraction";
    private String abdata="Abstraction is selecting data from a larger pool to show only the relevant details to the object. It helps to reduce programming complexity and effort. In Java, abstraction is accomplished using Abstract classes and interfaces. It is one of the most important concepts of OOPs.";
    String[] abt={"An abstract class is a class that is declared with abstract keyword.","An abstract method is a method that is declared without an implementation","An abstract class may or may not have all abstract methods. Some of them can be concrete methods","A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract"
    ,"There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator","An abstract class can have parametrized constructors and default constructor is always present in an abstract class"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstraction);
        TextView t= (TextView)findViewById(R.id.ab);
        TextView tt=(TextView)findViewById(R.id.abdata);

        t.setText(ab);
        tt.setText(abdata);

        ListView l=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listview,abt);
        l.setAdapter(adapter);

    }
}
