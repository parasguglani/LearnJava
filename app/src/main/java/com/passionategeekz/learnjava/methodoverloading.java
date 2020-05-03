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


public class methodoverloading extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to understand the concept of method overloading\n" +
                "class methodoverloadingdemo\n" +
                "{\n" +
                "    public void sum()\n" +
                "    {\n" +
                "        System.out.println(\"Method having no Parameters\");\n" +
                "    }\n" +
                "    public void sum(int a)\n" +
                "    {\n" +
                "        System.out.println(\"Value of a=\" +a);\n" +
                "    }\n" +
                "    public void data(int b)\n" +
                "    {\n" +
                "        System.out.println(\"Value of b=\" +b);\n" +
                "    }\n" +
                "    public void sum(int a,int b)\n" +
                "    {\n" +
                "        int c=a+b;\n" +
                "        System.out.println(\"Value of c by adding a and b=\" +c);\n" +
                "    }\n" +
                "}\n" +
                "public class methodoverloadig\n" +
                "{\n" +
                "    public static void main(String[] args) {\n" +
                "      methodoverloadingdemo md=new methodoverloadingdemo();\n" +
                "      md.sum();\n" +
                "      md.sum(5);\n" +
                "      md.data(6);\n" +
                "      md.sum(5,6);\n" +
                "    }\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Method having no Parameters\n" +
                "Value of a=5\n" +
                "Value of b=6\n" +
                "Value of c by adding a and b=11");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
