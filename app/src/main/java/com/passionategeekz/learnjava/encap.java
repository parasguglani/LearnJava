package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class encap extends AppCompatActivity {

    private String en="Encapsulation ";
    private String enpdata="Encapsulation is the process of integrating data and functions into a single unit called class. In Encapsulation, the data is not obtained directly, it is obtained through the functions present in the class.";
    String[] enp={"The basic idea of encapsulation is to wrap up or combine the data and methods used in a program into unique entities called objects.\n",
            "A program has two parts : data and functions. Thus an object has all of its data and functions grouped up together in the form of objects.\n" ,
            "The grouping is done in such a way , that the data and functions of a code do not mix with one another. That is why it is known as en”capsulation”. Just like, the different contents of a capsule are kept separated from one another."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encap);

        TextView t= (TextView)findViewById(R.id.en);
        TextView tt=(TextView)findViewById(R.id.enpdata);

        t.setText(en);
        tt.setText(enpdata);

        ListView v=(ListView)findViewById(R.id.k);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.listview,enp);
        v.setAdapter(adapter);
    }
}
