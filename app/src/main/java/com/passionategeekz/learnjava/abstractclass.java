package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.ColorThemeData;

public class abstractclass extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("//Program for the use of abstract class\n" +
                "abstract class Shape\n" +
                "{\n" +
                "    abstract double area();\n" +
                "    abstract double circumferences();\n" +
                "}\n" +
                " class Rect extends Shape\n" +
                "{\n" +
                " private int length,breath;\n" +
                "\n" +
                " Rect(int x,int y)\n" +
                " {\n" +
                "     length=x;\n" +
                "     breath=y;\n" +
                " }\n" +
                " double area()\n" +
                " {\n" +
                "     double a;\n" +
                "     a=length*breath;\n" +
                "     return(a);\n" +
                " }\n" +
                " double circumferences()\n" +
                " {\n" +
                "     double cir;\n" +
                "     cir=2*(length*breath);\n" +
                "     return(cir);\n" +
                " }\n" +
                "}\n" +
                "class circle1 extends Shape\n" +
                "{\n" +
                "    double radius;\n" +
                "    circle1(double r)\n" +
                "    {\n" +
                "        radius=r;\n" +
                "    }\n" +
                "    double area()\n" +
                "    {\n" +
                "        double ar;\n" +
                "        ar=Math.PI*radius*radius;\n" +
                "        return(ar);\n" +
                "    }\n" +
                "    double circumferences()\n" +
                "    {\n" +
                "        double ci;\n" +
                "        ci=2*Math.PI*radius;\n" +
                "        return(ci);\n" +
                "    }\n" +
                "}\n" +
                "public class Abstractdemo\n" +
                "{\n" +
                "\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "      Shape s;\n" +
                "      Rect r=new Rect(10,20);\n" +
                "      s=r;\n" +
                "      System.out.println(\"Area of Rectangle=\" +s.area());\n" +
                "      System.out.println(\"Circumference=\" +s.circumferences());\n" +
                "\n" +
                "      circle1 c=new circle1(5);\n" +
                "      s=c;\n" +
                "      System.out.println(\"Area of Rectangle=\" +s.area());\n" +
                "      System.out.println(\"Circumference=\" +s.circumferences());\n" +
                "    }\n" +
                "}");
        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);

        out.setCode("Area of Rectangle=200.0\n" +
                "Circumference=400.0\n" +
                "Area of Rectangle=78.5\n" +
                "Circumference=31.78");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);

    }
}
