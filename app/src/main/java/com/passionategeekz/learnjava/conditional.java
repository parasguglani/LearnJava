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


public class conditional extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("import java.util.Scanner;\n" +
                "\n" +
                "class CheckEvenOdd\n" +
                "{\n" +
                "  public static void main(String args[])\n" +
                "  {\n" +
                "    int num;\n" +
                "    System.out.println(\"Enter an Integer number:\");\n" +
                "\n" +
                "    //The input provided by user is stored in num\n" +
                "    Scanner input = new Scanner(System.in);\n" +
                "    num = input.nextInt();\n" +
                "\n" +
                "    /* If number is divisible by 2 then it's an even number\n" +
                "     * else odd number*/\n" +
                "    if ( num % 2 == 0 )\n" +
                "        System.out.println(\"Entered number is even\");\n" +
                "     else\n" +
                "        System.out.println(\"Entered number is odd\");\n" +
                "  }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Enter an Integer number:\n" +
                "78\n" +
                "Entered number is even");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}