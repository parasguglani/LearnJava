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

public class finalmethod extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Progarm to use the final keyword in class method\n" +
                "class Base09\n" +
                "{\n" +
                "   final void display()\n" +
                "    {\n" +
                "        System.out.println(\"Base Method called\");\n" +
                "    }\n" +
                "}\n" +
                "class derived09 extends Base09\n" +
                "{\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(\"Derived method called\");\n" +
                "    }\n" +
                "}\n" +
                "public class finalmethoddemo\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        derived09 ob=new derived09();\n" +
                "        ob.display();\n" +
                "    }\n" +
                "}\n");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("finalmethoddemo.java:11: error: display() in derived09 cannot override display() in Base09\n" +
                "    void display()\n" +
                "         ^\n" +
                "  overridden method is final");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
