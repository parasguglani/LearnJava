package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class decisionmak extends AppCompatActivity {

    private  String d ="Decision Making";
    private String data ="Decision making structures have one or more conditions to be evaluated or tested by the program, along with a statement or statements that are to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false.";
    private  String datade="Statement & Description\n" +
            "1\tif statement\n" +
            "An if statement consists of a boolean expression followed by one or more statements.\n" +
            "\n" +
            "2\tif...else statement\n" +
            "An if statement can be followed by an optional else statement, which executes when the boolean expression is false.\n" +
            "\n" +
            "3\tnested if statement\n" +
            "You can use one if or else if statement inside another if or else if statement(s).\n" +
            "\n" +
            "4\tswitch statement\n" +
            "A switch statement allows a variable to be tested for equality against a list of values.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decisionmak);


    }
}
