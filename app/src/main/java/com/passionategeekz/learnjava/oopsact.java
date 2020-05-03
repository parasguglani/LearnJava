package com.passionategeekz.learnjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class oopsact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oopsact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.Inheritance:
                        Intent i = new Intent(oopsact.this, Inheritance.class);
                        startActivity(i);
                        break;
                    case R.id.Overriding:
                        Intent a = new Intent(oopsact.this, overriding.class);
                        startActivity(a);
                        break;
                    case R.id.Polymorphism:
                        Intent b = new Intent(oopsact.this, polymor.class);
                        startActivity(b);
                        break;
                    case R.id.Abstraction:
                        Intent c = new Intent(oopsact.this, abstraction.class);
                        startActivity(c);
                        break;
                    case R.id.Encapsulation:
                        Intent d = new Intent(oopsact.this, encap.class);
                        startActivity(d);
                        break;
                    case R.id.Interfaces:
                        Intent e = new Intent(oopsact.this, interfaced.class);
                        startActivity(e);
                        break;
                    case R.id.Packages:
                        Intent f = new Intent(oopsact.this, packageg.class);
                        startActivity(f);
                        break;


                }
                return false;
            }
        });

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.oopsact, menu);
        return true;
    }


}
