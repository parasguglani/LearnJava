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

public class reverse extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("import java.util.Scanner;\n" +
                "class ReverseNumberWhile\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "      int num=0;\n" +
                "      int reversenum =0;\n" +
                "      System.out.println(\"Input your number and press enter: \");\n" +
                "      //This statement will capture the user input\n" +
                "      Scanner in = new Scanner(System.in);\n" +
                "      //Captured input would be stored in number num\n" +
                "      num = in.nextInt();\n" +
                "      //While Loop: Logic to find out the reverse number\n" +
                "      while( num != 0 )\n" +
                "      {\n" +
                "          reversenum = reversenum * 10;\n" +
                "          reversenum = reversenum + num%10;\n" +
                "          num = num/10;\n" +
                "      }\n" +
                "\n" +
                "      System.out.println(\"Reverse of input number is: \"+reversenum);\n" +
                "   }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Input your number and press enter: \n" +
                "145689\n" +
                "Reverse of input number is: 986541");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
