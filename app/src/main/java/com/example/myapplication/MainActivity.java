package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[]{
                "ICT650",
                "ICT602",
                "Mobile Tech",
                "Lab 3",
                "Android Studio",
                "View",
                "List View",
                "Assalamualaikum",
                "万歳"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

    }
}
