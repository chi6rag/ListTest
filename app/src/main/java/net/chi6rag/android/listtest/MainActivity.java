package net.chi6rag.android.listtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    String[] names = {"Chirag", "Ayushi", "Tushar", "Shikhar", "Amiedeep", "Saurabh", "Palak"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.single_row, R.id.viewText, names);
        listView.setAdapter(arrayAdapter);
    }
}
