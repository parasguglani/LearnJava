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


public class arithmatic extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to perform Arithemtic Operations\n" +
                "import java.util.Scanner;\n" +
                "public class arithmetic\n" +
                "{\n" +
                "    public static void main(String args[])\n" +
                "    {\n" +
                "        int a, b, c, d, e, f;\n" +
                "        System.out.println(\"enter the value of a and b\");\n" +
                "        Scanner ob=new Scanner (System.in);\n" +
                "        a=ob.nextInt();\n" +
                "        b=ob.nextInt();\n" +
                "        c=a+b;\n" +
                "        d=a-b;\n" +
                "        e=a*b;\n" +
                "        f=a/b;\n" +
                "        System.out.println(\"ans is =\" +c);\n" +
                "        System.out.println(\"ans is =\" +d);\n" +
                "        System.out.println(\"ans is =\" +e);\n" +
                "        System.out.println(\"ans is =\" +f);\n" +
                "    }\n" +
                "}\n");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("enter the value of a and b\n"+
                "8 5\n"+
                "ans is 13\n"+
                "ans is 3 \n"+
                "ans is 40 \n"+
                "ans is 1 \n");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}