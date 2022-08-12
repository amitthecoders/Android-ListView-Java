package com.illusionuniverse.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        arrayList.add("Amit");
        arrayList.add("Apple");
        arrayList.add("Ankit");
        arrayList.add("Kaka");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);


    }
}