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

public class string extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("\n" +
                "public class string\n" +
                "{\n" +
                "\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "      String str1= \"welcome\";\n" +
                "      String str2=\"       dav\";\n" +
                "      String str3=\"college\";\n" +
                "      System.out.println(\"Str1.ToUpperCase()=\"+str1.toUpperCase());\n" +
                "      System.out.println(\"str2.ToLowerCase()=\"+str2.toLowerCase());\n" +
                "      System.out.println(\"str2=\"+str2);\n" +
                "      System.out.println(\"str2.trim=\"+str2.trim());\n" +
                "      System.out.println(\"str1.replace('e','C')=\"+str1.replace('e','C'));\n" +
                "\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Str1.ToUpperCase()=WELCOME\n" +
                "str2.ToLowerCase()=       dav\n" +
                "str2=       dav\n" +
                "str2.trim=dav\n" +
                "str1.replace('e','C')=wClcomC");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}

