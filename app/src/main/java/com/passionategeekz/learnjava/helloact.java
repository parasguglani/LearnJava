package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.widget.TextView;

public class helloact extends AppCompatActivity {

    private String html ="<p class=\"prettyprint notranslate prettyprinted\"><span style=\"color: #0000ff;\"><span class=\"kwd\">public</span> <span class=\"kwd\">class</span></span> <span class=\"typ\" style=\"color: #ff0000;\">MyFirstJavaProgram</span> <span class=\"pun\">{<br /></span><br /><br /> <span class=\"com\" style=\"color: #339966;\">/* This is my first java program. * This will print 'Hello World' as the output */<br /><br /></span> <br /><br /><span style=\"color: #0000ff;\"> <span class=\"kwd\">public</span> <span class=\"kwd\">static</span> <span class=\"kwd\">void</span><span class=\"pln\"> main</span></span><span class=\"pun\">(</span><span style=\"color: #ff0000;\"><span class=\"typ\">String</span> <span class=\"pun\">[]</span><span class=\"pln\">args</span></span><span class=\"pun\">)</span> <span class=\"pun\">{</span> <span style=\"color: #008000;\"><span class=\"typ\">System</span><span class=\"pun\">.</span><span class=\"kwd\">out</span><span class=\"pun\">.</span><span class=\"pln\">println</span><span class=\"pun\">(</span><span class=\"str\">\"Hello World\"</span><span class=\"pun\">);</span></span> <span class=\"pun\">}</span> <span class=\"pun\">}<br /><br />Output :<br /><br /><strong><span style=\"background-color: #000000; color: #ffffff;\">Hello World</span></strong></span></p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        TextView t=(TextView)findViewById(R.id.html);
        t.setText(HtmlCompat.fromHtml(html, 0));
    }
}
