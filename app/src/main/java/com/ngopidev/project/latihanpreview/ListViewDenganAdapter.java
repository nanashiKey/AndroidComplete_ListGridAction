package com.ngopidev.project.latihanpreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListViewDenganAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_dengan_adapter);

        ListView listView = findViewById(R.id.listView);
        List<String> data = new ArrayList<String>();
        data.add("Bandung");
        data.add("Depok");
        data.add("Jakarta");
        data.add("Surabaya");
        data.add("Padang");
        data.add("Sulawesi");
        data.add("Tangerang");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(arrayAdapter);
    }
}
