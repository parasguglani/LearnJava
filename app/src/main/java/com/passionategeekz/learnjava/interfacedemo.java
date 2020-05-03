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


public class interfacedemo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the concept of interface\n" +
                "interface Shape1\n" +
                "{\n" +
                "    double area2();\n" +
                "    double circumferences1();\n" +
                "}\n" +
                " class Rect4 implements Shape1\n" +
                "{\n" +
                " private int length,breath;\n" +
                "\n" +
                " Rect4(int x,int y)\n" +
                " {\n" +
                "     length=x;\n" +
                "     breath=y;\n" +
                " }\n" +
                " public double area2()\n" +
                " {\n" +
                "     double a;\n" +
                "     a=length*breath;\n" +
                "     return(a);\n" +
                " }\n" +
                "public double circumferences1()\n" +
                " {\n" +
                "     double cir;\n" +
                "     cir=2*(length*breath);\n" +
                "     return(cir);\n" +
                " }\n" +
                "}\n" +
                "class circ3 implements Shape1\n" +
                "{\n" +
                "   public double radius;\n" +
                "    circ3(double r)\n" +
                "    {\n" +
                "        radius=r;\n" +
                "    }\n" +
                "    public double area2()\n" +
                "    {\n" +
                "        double ar;\n" +
                "        ar=Math.PI*radius*radius;\n" +
                "        return(ar);\n" +
                "    }\n" +
                "    public double circumferences1()\n" +
                "    {\n" +
                "        double ci;\n" +
                "        ci=2*Math.PI*radius;\n" +
                "        return(ci);\n" +
                "    }\n" +
                "}\n" +
                "public class InterfaceDemo\n" +
                "{\n" +
                "\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "      Shape1 []s=new Shape1[2];\n" +
                "      s[0]=new Rect4(10,12);\n" +
                "      s[1]=new circ3(2.5);\n" +
                "\n" +
                "      for(int i=0;i<s.length;i++)\n" +
                "      {\n" +
                "          System.out.println(\"\"+s[i].area2());\n" +
                "           System.out.println(\"\"+s[i].circumferences1());\n" +
                "      }\n" +
                "}}\n");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("120.0\n" +
                "240.0\n" +
                "19.634954084936208\n" +
                "15.707963267948966");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
