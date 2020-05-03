package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class datatypee extends AppCompatActivity {

    private  String var1="Variables";
    private String var="A variable is a location in memory (storage area) to hold data by assigning different data types to variables, you can store integers, decimals, or characters in these variables";
    private String pri="There are eight primitive datatypes supported by Java. Primitive datatypes are predefined by the language and named by a keyword. Let us now look into the eight primitive data types in detail.";
    private String pridata="byte\n";
    private String pridatad=  "Byte data type is an 8-bit signed two's complement integer\n" +
            "Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.\n" +
            "\n";

    private String shortt="short\n";
    private String shorttdata= "Short data type is a 16-bit signed two's complement integer\n" +"Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer\n" +
            "\n" +

            "\n";
        private String ints ="int\n";
    private String intsdata=  "Int data type is a 32-bit signed two's complement integer.\n" +
            "Integer is generally used as the default data type for integral values unless there is a concern about memory";

         private String longg= "long\n";
    private String longgdata= "Long data type is a 64-bit signed two's complement integer\n" +
            "This type is used when a wider range than int is needed\n";

          private  String ft =  "float\n";
    private  String ftdata="Float data type is a single-precision 32-bit IEEE 754 floating point\n" +
            "\n" +
            "Float is mainly used to save memory in large arrays of floating point numbers\n" +
            "Float data type is never used for precise values such as currency\n";

            private String dou="double";
    private String doudata= "double data type is a double-precision 64-bit IEEE 754 floating point\n" +
            "\n" +
            "This data type is generally used as the default data type for decimal values, generally the default choice\n" +
            "\n" +
            "Double data type should never be used for precise values such as currency\n";


          private String ch=  "char\n";
    private String chdata= "char data type is a single 16-bit Unicode character\n" +
            "Char data type is used to store any character\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datatypee);

        TextView t= (TextView)findViewById(R.id.var1);
        TextView t1= (TextView)findViewById(R.id.var);
        TextView t2= (TextView)findViewById(R.id.pri);
        TextView t3= (TextView)findViewById(R.id.pridatad);
        TextView t4= (TextView)findViewById(R.id.shorttdata);
        TextView t5= (TextView)findViewById(R.id.intsdata);
        TextView t6= (TextView)findViewById(R.id.longgdata);
        TextView t7= (TextView)findViewById(R.id.ftdata);
        TextView t8= (TextView)findViewById(R.id.doudata);
        TextView t9= (TextView)findViewById(R.id.chdata);

        t.setText(var1);
        t1.setText(var);
        t2.setText(pri);
        t3.setText(pridatad);
        t4.setText(shorttdata);
        t5.setText(intsdata);
        t6.setText(longgdata);
        t7.setText(ftdata);
        t8.setText(doudata);
        t9.setText(chdata);



    }
}
