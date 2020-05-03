package com.passionategeekz.learnjava;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ArrayAdapter;

        import io.github.kbiakov.codeview.CodeView;
        import io.github.kbiakov.codeview.highlight.ColorTheme;

public class hello extends AppCompatActivity {


@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        CodeView codeView = (CodeView) findViewById(R.id.cc);

        codeView.setCode("public class HelloWorld\n" +
        " {\n" +
        " public static void main(String args[])\n" +
        " System.out.println(\"Hello World!\");\n" +
        " }");
        }
        }
