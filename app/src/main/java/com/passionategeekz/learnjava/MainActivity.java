package com.passionategeekz.learnjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private  String head ="Java";
    private  String data= "Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.";
    private String head2 ="Features of java Programming";
    private String subhead1 ="Object Oriented";
    private  String Subheaddata1="In Java, everything is an Object. Java can be easily extended since it is based on the Object model.";
    private String subhead2 ="Simple";
    private  String Subheaddata2="Java is easy to learn language if you understand the basic concept of OOP Java, it would be easy to learn.";
    private String subhead3 ="Secure";
    private  String Subheaddata3=" Java enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.";
    private String subhead4 ="Portable";
    private  String Subheaddata4="In Java, everything is an Object. Java can be easily extended since it is based on the Object model.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=(TextView)findViewById(R.id.head);
        t.setText(head);
        TextView T = (TextView)findViewById(R.id.data);
        T.setText(data);
        TextView h2 = (TextView)findViewById(R.id.head2);
        h2.setText(head2);
        TextView sead = (TextView)findViewById(R.id.subhead);
        sead.setText(subhead1);
        TextView subheaddata1 = (TextView)findViewById(R.id.subheaddata);
        subheaddata1.setText(Subheaddata1);
        ////
        TextView sead2 = (TextView)findViewById(R.id.subhead2);
        sead2.setText(subhead2);
        TextView subheaddata2 = (TextView)findViewById(R.id.subheaddata2);
        subheaddata2.setText(Subheaddata2);
        /////
        TextView sead3 = (TextView)findViewById(R.id.subhead3);
        sead3.setText(subhead3);
        TextView subheaddata3 = (TextView)findViewById(R.id.subheaddata3);
        subheaddata3.setText(Subheaddata3);
        ///////
        TextView sead4 = (TextView)findViewById(R.id.subhead4);
        sead4.setText(subhead4);
        TextView subheaddata4 = (TextView)findViewById(R.id.subheaddata4);
        subheaddata4.setText(Subheaddata4);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.intro:
                        Intent i = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.appli:
                        Intent a = new Intent(MainActivity.this,appli.class);
                        startActivity(a);
                        break;
                    case R.id.iden:
                        Intent b = new Intent(MainActivity.this,idenkey.class);
                        startActivity(b);
                        break;
                    case R.id.obj:
                        Intent c = new Intent(MainActivity.this,objclas.class);
                        startActivity(c);
                        break;
                    case R.id.data:
                        Intent d = new Intent(MainActivity.this,datatypee.class);
                        startActivity(d);
                        break;
                    case R.id.oper:
                        Intent e = new Intent(MainActivity.this,opera.class);
                        startActivity(e);
                        break;
                    case R.id.dm:
                        Intent f = new Intent(MainActivity.this,decisionmak.class);
                        startActivity(f);
                        break;
                    case R.id.loop:
                        Intent g = new Intent(MainActivity.this,loo.class);
                        startActivity(g);
                        break;
                    case R.id.array:
                        Intent h = new Intent(MainActivity.this,arrayy.class);
                        startActivity(h);
                        break;
                    case R.id.Exceptions:
                        Intent j = new Intent(MainActivity.this,excep.class);
                        startActivity(j);
                        break;

                } return false;
            }
        });
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
