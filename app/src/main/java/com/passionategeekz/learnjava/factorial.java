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

public class factorial extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to find the factorial of a number\n" +
                "import java.util.Scanner;\n" +
                "public class factorial\n" +
                "{\n" +
                "    public static void main(String args[])\n" +
                "    {\n" +
                "        int fact=1,n,i;\n" +
                "        Scanner ob=new Scanner(System.in);\n" +
                "        System.out.println(\"enter the value of n\");\n" +
                "        n=ob.nextInt();\n" +
                "        for(i=1;i<=n;i++)\n" +
                "        {\n" +
                "            fact=fact*i;\n" +
                "            if(i==5)\n" +
                "            {\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "         System.out.println(\"Answer is=\" +fact);\n" +
                "    }\n" +
                "}\n");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("Answer is= 120");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
