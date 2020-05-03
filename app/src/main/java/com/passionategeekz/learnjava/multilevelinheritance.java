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

public class multilevelinheritance extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("public class Demo {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "       int num = 10, count, total = 0;\n" +
                "\n" +
                "       for(count = 1; count <= num; count++){\n" +
                "           total = total + count;\n" +
                "       }\n" +
                "\n" +
                "       System.out.println(\"Sum of first 10 natural numbers is: \"+total);\n" +
                "    }\n" +
                "}");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("Sum of first 10 natural numbers is: 55\n");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
