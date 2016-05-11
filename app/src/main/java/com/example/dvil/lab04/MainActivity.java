package com.example.dvil.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] values = new String[] {"Wartość 1", "Wartość 2", "Wartość 3", "Wartość 4", "Wartość 5", "Wartość 6", "Wartość 7", "Wartość 8", "Wartość 9"};
        this.target = new ArrayList<String>();
        this.target.addAll(Arrays.asList(values));

        this.adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.target);

        ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(this.adapter);
    }


}
