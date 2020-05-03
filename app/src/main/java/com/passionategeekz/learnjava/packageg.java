package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class packageg extends AppCompatActivity {

    String[] a = {"Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee\n" ,
            "Making searching/locating and usage of classes, interfaces, enumerations and annotations easier\n" ,
            "Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.\n" ,
            "Packages can be considered as data encapsulation (or data-hiding)."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packageg);

        ListView lv= (ListView)findViewById(R.id.pk);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listview,a) ;
        lv.setAdapter(adapter);
    }
}
