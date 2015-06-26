package net.chi6rag.android.listtest;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    String[] memeTitles;
    String[] memeDescriptions;
    int[] images = {R.drawable.ic_launcher, R.drawable.ic_launcher,
                    R.drawable.ic_launcher, R.drawable.ic_launcher,
                    R.drawable.ic_launcher, R.drawable.ic_launcher,
                    R.drawable.ic_launcher, R.drawable.ic_launcher,
                    R.drawable.ic_launcher, R.drawable.ic_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        memeTitles = res.getStringArray(R.array.titles);
        memeDescriptions = res.getStringArray(R.array.descriptions);

        ListView listView = (ListView) findViewById(R.id.listView);

        ChiragAdapter adapter = new ChiragAdapter(this, memeTitles, memeDescriptions, images);
        listView.setAdapter(adapter);
    }
}

class ChiragAdapter extends ArrayAdapter<String>{

    Context context;
    int[] images;
    String[] titleArray;
    String[] descriptionArray;

    ChiragAdapter(Context c, String[] titles, String[] descriptionArray, int imgs[]){
        super(c, R.layout.single_row, R.id.viewTitle, titles);
        this.context = c;
        this.images = imgs;
        this.titleArray = titles;
        this.descriptionArray = descriptionArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.single_row, parent, false);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
        TextView textTitle = (TextView) row.findViewById(R.id.viewTitle);
        TextView textDescription = (TextView) row.findViewById(R.id.viewDescription);

        imageView.setImageResource(images[position]);
        textTitle.setText(titleArray[position]);
        textDescription.setText(descriptionArray[position]);

        return row;
    }
}