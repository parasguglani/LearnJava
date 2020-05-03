package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class programs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        ListView p2=(ListView)findViewById(R.id.listprogjava);
        String[] p={"Hello World","Add two Numbers","Arithmatic","Array","Check Even or Odd Number","Constructor","Copy Constructor","Exception Handling","Factorial",
                "Final Class","Final Method","Prime Numbers","Interface Concept using Rectangle and Circle","MethodOverloading","Sum of Natural Numbers","Operator","Super Class","Switch Statement","Area Of Rectangle(Abstract)","Reverse Number","String Functions" };

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listview2,p);
        p2.setAdapter(adapter);
        p2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if (i==0)
                {
                    Intent a = new Intent(view.getContext(),helloworld.class);
                    startActivityForResult(a,0);
                }
                if (i==1)
                {
                    Intent b = new Intent(view.getContext(),addnumber.class);
                    startActivityForResult(b,0);
                } if (i==2)
                {
                    Intent a = new Intent(view.getContext(),arithmatic.class);
                    startActivityForResult(a,0);
                } if (i==3)
                {
                    Intent a = new Intent(view.getContext(),array.class);
                    startActivityForResult(a,0);
                } if (i==4)
                {
                    Intent a = new Intent(view.getContext(),conditional.class);
                    startActivityForResult(a,0);
                } if (i==5)
                {
                    Intent a = new Intent(view.getContext(),constructor.class);
                    startActivityForResult(a,0);
                } if (i==6)
                {
                    Intent a = new Intent(view.getContext(),copyconst.class);
                    startActivityForResult(a,0);
                } if (i==7)
                {
                    Intent a = new Intent(view.getContext(),exception.class);
                    startActivityForResult(a,0);
                } if (i==8)
                {
                    Intent a = new Intent(view.getContext(),factorial.class);
                    startActivityForResult(a,0);
                } if (i==9)
                {
                    Intent a = new Intent(view.getContext(),finalclass.class);
                    startActivityForResult(a,0);
                } if (i==10)
                {
                    Intent a = new Intent(view.getContext(),finalmethod.class);
                    startActivityForResult(a,0);
                } if (i==11)
                {
                    Intent a = new Intent(view.getContext(),prime.class);
                    startActivityForResult(a,0);
                } if (i==12)
                {
                    Intent a = new Intent(view.getContext(),interfacedemo.class);
                    startActivityForResult(a,0);
                } if (i==13)
                {
                    Intent a = new Intent(view.getContext(),methodoverloading.class);
                    startActivityForResult(a,0);
                } if (i==14)
                {
                    Intent a = new Intent(view.getContext(),multilevelinheritance.class);
                    startActivityForResult(a,0);
                } if (i==15)
                {
                    Intent a = new Intent(view.getContext(),operator.class);
                    startActivityForResult(a,0);
                } if (i==16)
                {
                    Intent a = new Intent(view.getContext(),superclass.class);
                    startActivityForResult(a,0);
                } if (i==17)
                {
                    Intent a = new Intent(view.getContext(),switchstatement.class);
                    startActivityForResult(a,0);
                } if (i==18)
                {
                    Intent a = new Intent(view.getContext(),abstractclass.class);
                    startActivityForResult(a,0);
                }
                if (i==19)
                {
                    Intent a = new Intent(view.getContext(),reverse.class);
                    startActivityForResult(a,0);
                }
                if (i==20)
                {
                    Intent a = new Intent(view.getContext(),string.class);
                    startActivityForResult(a,0);
                }
            }
        });
    }
}
