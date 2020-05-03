package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class idenkey extends AppCompatActivity {

    private String iden ="Identifiers";
    private String idendata="All Java components require names. Names used for classes, variables, and methods are called identifiers.";
    private String key="Keywords";
    private String[] idendata1={"All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).\n" ,
            "After the first character, identifiers can have any combination of characters" ,

            "A key word cannot be used as an identifier",

            "Most importantly, identifiers are case sensitive"};

    private String keydata="abstract | assert || boolean || break\n" +
            "byte||case||catch||char\n" +
            "class||const||continue||default\n" +
            "do||double||else||enum\n" +
            "extends||final||finally||float\n" +
            "for||goto||if||implements\n" +
            "import||instanceof||int||interface\n" +
            "long||native||new||package\n" +
            "private||protected||public||return\n" +
            "short||static||strictfp||super\n" +
            "switch||synchronized||this||throw\n" +
            "throws||transient||try||void\n" +
            "volatile||while";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idenkey);

        TextView i = (TextView)findViewById(R.id.iden);
        TextView id = (TextView)findViewById(R.id.idendata);
        ListView id1 = (ListView) findViewById(R.id.idendata1);
        TextView key1 = (TextView)findViewById(R.id.key);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.listview,idendata1);
        id1.setAdapter(adapter);

        i.setText(iden);
        id.setText(idendata);
        key1.setText(key);

    }
}
