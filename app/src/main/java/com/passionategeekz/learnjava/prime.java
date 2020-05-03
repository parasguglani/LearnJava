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

public class prime extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("import java.util.Scanner;\n" +
                "\n" +
                "class PrimeNumberDemo\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "      int n;\n" +
                "      int status = 1;\n" +
                "      int num = 3;\n" +
                "      //For capturing the value of n\n" +
                "      Scanner scanner = new Scanner(System.in);\n" +
                "      System.out.println(\"Enter the value of n:\");\n" +
                "      //The entered value is stored in the var n\n" +
                "      n = scanner.nextInt();\n" +
                "      if (n >= 1)\n" +
                "      {\n" +
                "         System.out.println(\"First \"+n+\" prime numbers are:\");\n" +
                "         //2 is a known prime number\n" +
                "         System.out.println(2);\n" +
                "      }\n" +
                "\n" +
                "      for ( int i = 2 ; i <=n ;  )\n" +
                "      {\n" +
                "         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )\n" +
                "         {\n" +
                "            if ( num%j == 0 )\n" +
                "            {\n" +
                "               status = 0;\n" +
                "               break;\n" +
                "            }\n" +
                "         }\n" +
                "         if ( status != 0 )\n" +
                "         {\n" +
                "            System.out.println(num);\n" +
                "            i++;\n" +
                "         }\n" +
                "         status = 1;\n" +
                "         num++;\n" +
                "      }         \n" +
                "   }\n" +
                "}");

        CodeView out = (CodeView) findViewById(R.id.out);
        ColorThemeData myTheme = ColorTheme.MONOKAI.theme();
        codeView.getOptions().setTheme(myTheme);


        out.setCode("Enter the value of n:\n" +
                "15\n" +
                "First 15 prime numbers are:\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "11\n" +
                "13\n" +
                "17\n" +
                "19\n" +
                "23\n" +
                "29\n" +
                "31\n" +
                "37\n" +
                "41\n" +
                "43\n" +
                "47");
        out.getOptions()
                .withTheme(ColorTheme.MONOKAI);
    }
}
