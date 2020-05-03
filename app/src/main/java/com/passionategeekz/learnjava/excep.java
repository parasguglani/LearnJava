package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class excep extends AppCompatActivity {
    private String exhead="Exception";
    private String exheaddata="An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.";
    private String error="Error vs Exception";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excep);

        TextView T= (TextView)findViewById(R.id.exhead);
        TextView T1= (TextView)findViewById(R.id.exheaddata);
        TextView T2= (TextView)findViewById(R.id.error);

        T.setText(exhead);
        T1.setText(exheaddata);
        T2.setText(error);


    }
}
