package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class appli extends AppCompatActivity {

    private String head ="Applications of Java";
    private String Subhead="Multithreaded ";
    private String Subheaddata="A multithreaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread ";
    private String Subhead1="High Performance  ";
    private String Subheaddata1="better, faster, or more efficient than others";
    private String Subhead2="Dynamic";
    private String Subheaddata2="Constant change, activity, or progress.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appli);

        TextView t= (TextView)findViewById(R.id.head);
        t.setText(head);
        TextView t1= (TextView)findViewById(R.id.data);
        t1.setText(Subhead);
        TextView t2= (TextView)findViewById(R.id.subhead);
        t2.setText(Subheaddata);
        TextView t3= (TextView)findViewById(R.id.head5);
        t3.setText(Subhead1);
        TextView t4= (TextView)findViewById(R.id.head6);
        t4.setText(Subheaddata1);
        TextView t5= (TextView)findViewById(R.id.head7);
        t5.setText(Subhead2);
        TextView t6= (TextView)findViewById(R.id.head8);
        t6.setText(Subheaddata2);

    }
}
