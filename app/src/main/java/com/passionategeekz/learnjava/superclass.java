package com.passionategeekz.learnjava;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.passionategeekz.learnjava.R;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.ColorThemeData;

public class superclass extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("class point{\n" +
                "private int x,y,z;\n" +
                "point(int x1, int y1, int z1){\n" +
                "System.out.println(\"Super class constructor called\");\n" +
                "x=x1;\n" +
                "y=y1;\n" +
                "z=z1;\n" +
                "}\n" +
                "public int getx(){\n" +
                "return x;\n" +
                "}\n" +
                "public int gety(){\n" +
                "return y;\n" +
                "}\n" +
                "public int getz(){\n" +
                "return z;\n" +
                "}\n" +
                "}\n" +
                "class sphere extends point{\n" +
                "    private int radius;\n" +
                "    sphere(int x1, int y1, int z1, int r)\n" +
                "    {\n" +
                "    super(x1, y1, z1);\n" +
                "    System.out.println(\"Derived class constructor called\");\n" +
                "    radius=r;\n" +
                "    }\n" +
                "public int getradius()\n" +
                "{\n" +
                "return radius;\n" +
                "}\n" +
                "public double volume()\n" +
                "{\n" +
                "return(4*Math.PI*Math.pow(radius,3));\n" +
                "}\n" +
                "}\n" +
                "public class superclass {\n" +
                "    public static void main(String[] args) {\n" +
                "        sphere s=new sphere(5,3,4,5);\n" +
                "        System.out.println(\"x coordinate=\"+s.getx());\n" +
                "        System.out.println(\"y coordinate=\"+s.gety());\n" +
                "        System.out.println(\"z coordinate=\"+s.getz());\n" +
                "        System.out.println(\"radius is = \"+s.getradius());\n" +
                "        System.out.println(\"volume of sphere =\"+s.volume());\n" +
                "    }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Super class constructor called\n" +
                "Derived class constructor called\n" +
                "x coordinate=5\n" +
                "y coordinate=3\n" +
                "z coordinate=4\n" +
                "radius is = 5\n" +
                "volume of sphere =1570.7963267948965");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
