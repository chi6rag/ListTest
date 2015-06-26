package net.chi6rag.android.listtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.single_row, R.id.textView, days);
        l.setAdapter(arrayAdapter);
    }
}
