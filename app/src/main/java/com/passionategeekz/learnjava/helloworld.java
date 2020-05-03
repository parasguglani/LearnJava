package com.passionategeekz.learnjava;
import android.app.Fragment;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.passionategeekz.learnjava.R;

import java.io.IOException;
import java.util.Objects;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.classifier.CodeProcessor;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.ColorThemeData;
import io.github.kbiakov.codeview.highlight.Font;
import io.github.kbiakov.codeview.highlight.SyntaxColors;

public class helloworld extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);


      final CodeView codeView = (CodeView) findViewById(R.id.cc);
        CodeView out = (CodeView) findViewById(R.id.out);
        codeView.setCode("public class HelloWorld\n" +
                " {\n" +
                " public static void main(String args[])\n" +
                " System.out.println(\"Hello World!\");\n" +
                " }");

     out.setCode("Hello World!");;

        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);


    }
    }
