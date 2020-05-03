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


public class array extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the concept of array\n" +
                "public class array\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        int[] input=new int[5];\n" +
                "       input[0]=2;\n" +
                "       input[1]=3;\n" +
                "       input[2]=3;\n" +
                "       input[3]=3;\n" +
                "       input[4]=3;\n" +
                "       System.out.println(\"\"+input[0]);\n" +
                "            System.out.println(\"\"+input[1]);\n" +
                "                 System.out.println(\"\"+input[2]);\n" +
                "                      System.out.println(\"\"+input[3]);\n" +
                "                           System.out.println(\"\"+input[4]);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("2\n" +
                "3\n" +
                "3\n" +
                "3\n" +
                "3");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}