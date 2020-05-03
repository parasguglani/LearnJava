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


public class copyconst extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the concept of copy constructor\n" +
                "class constructors\n" +
                "{\n" +
                "    int a,b;\n" +
                " constructors()\n" +
                " {\n" +
                "     a=5;\n" +
                "     b=2;\n" +
                "     System.out.println(\"default constructor\");\n" +
                " }\n" +
                "}\n" +
                "\n" +
                "  class psb\n" +
                "  {\n" +
                "      int x,y;\n" +
                "     psb(constructors obj)\n" +
                " {\n" +
                "     x=obj.a;\n" +
                "     y=obj.b;\n" +
                " }\n" +
                " public void display()\n" +
                " {\n" +
                "     int c;\n" +
                "     c=x*y;\n" +
                "     System.out.println(\"value of c = \"+c);\n" +
                " }}\n" +
                "\n" +
                "public class copyconst\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        constructors d=new constructors();\n" +
                "        psb o=new psb(d);\n" +
                "        o.display();\n" +
                "    }\n" +
                "\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("default constructor\n" +
                "value of c = 10");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}

