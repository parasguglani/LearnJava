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

public class finalclass  extends AppCompatActivity {


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the final keyword in class\n" +
                "final class Base10\n" +
                "{\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(\"Base Method called\");\n" +
                "    }\n" +
                "}\n" +
                "class derived10 extends Base10\n" +
                "{\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(\"Derived method called\");\n" +
                "    }\n" +
                "}\n" +
                "public class finalclassdemo\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        derived10 ob=new derived10();\n" +
                "        ob.display();\n" +
                "    }\n" +
                "}\n");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("finalclassdemo.java:9: error: cannot inherit from final Base10\n" +
                "class derived10 extends Base10");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
        }
        }
