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

public class switchstatement extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("int day = 4;\n" +
                "switch (day) {\n" +
                "  case 1:\n" +
                "    System.out.println(\"Monday\");\n" +
                "    break;\n" +
                "  case 2:\n" +
                "    System.out.println(\"Tuesday\");\n" +
                "    break;\n" +
                "  case 3:\n" +
                "    System.out.println(\"Wednesday\");\n" +
                "    break;\n" +
                "  case 4:\n" +
                "    System.out.println(\"Thursday\");\n" +
                "    break;\n" +
                "  case 5:\n" +
                "    System.out.println(\"Friday\");\n" +
                "    break;\n" +
                "  case 6:\n" +
                "    System.out.println(\"Saturday\");\n" +
                "    break;\n" +
                "  case 7:\n" +
                "    System.out.println(\"Sunday\");\n" +
                "    break;\n" +
                "}");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Thursday");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
