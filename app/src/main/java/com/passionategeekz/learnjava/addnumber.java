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


public class addnumber extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("public class AddTwoNumbers {\n" +
                "\n" +
                "   public static void main(String[] args) {\n" +
                "        \n" +
                "      int num1 = 5, num2 = 15, sum;\n" +
                "      sum = num1 + num2;\n" +
                "\n" +
                "      System.out.println(\"Sum of these numbers: \"+sum);\n" +
                "   }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Sum of these numbers: 20");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}