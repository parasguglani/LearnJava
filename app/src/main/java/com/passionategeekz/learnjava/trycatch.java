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

public class trycatch  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("public class MyClass {\n" +
                "  public static void main(String[ ] args) {\n" +
                "    try {\n" +
                "      int[] myNumbers = {1, 2, 3};\n" +
                "      System.out.println(myNumbers[10]);\n" +
                "    } catch (Exception e) {\n" +
                "      System.out.println(\"Something went wrong.\");\n" +
                "    }\n" +
                "  }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        codeView.getOptions()
                .withTheme(ColorTheme.MONOKAI);

        out.setCode("Something went wrong");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
