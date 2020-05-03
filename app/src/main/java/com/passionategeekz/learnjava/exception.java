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


public class exception extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program to use the concept of exception handling\n" +
                "import java.util.Scanner;\n" +
                "public class ExceptionHandling\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        int x,y,z;\n" +
                "        try\n" +
                "        {\n" +
                "            Scanner ob=new Scanner(System.in);\n" +
                "            System.out.println(\"Enter the value of x=\");\n" +
                "            x=ob.nextInt();\n" +
                "            System.out.println(\"Enter the value of y=\");\n" +
                "            y=ob.nextInt();\n" +
                "            z=x/y;\n" +
                "        System.out.println(\"Value of z is=\"+z);\n" +
                "        }\n" +
                "        catch(ArithmeticException e)\n" +
                "                {\n" +
                "                     System.out.println(\"Denominator cannot be zero\");\n" +
                "                }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Enter the value of x= 5 \n"+
                "Enter the value of y= 0 \n"+
                "Denominator cannot be zero");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
