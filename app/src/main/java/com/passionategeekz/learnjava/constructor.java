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


public class constructor extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the concept of constructor\n" +
                "class ctrdemo\n" +
                "{\n" +
                "   int a,b,c;\n" +
                "ctrdemo()\n" +
                "{\n" +
                "    a=2;\n" +
                "    b=2;\n" +
                "    c=a+b;\n" +
                "    System.out.println(\"The value of c is=\"+c);\n" +
                "}\n" +
                "}\n" +
                "public class ctr\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        ctrdemo d=new ctrdemo();\n" +
                "    }\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("The value of c is=4");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
