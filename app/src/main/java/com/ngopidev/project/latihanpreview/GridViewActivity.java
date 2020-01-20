package com.ngopidev.project.latihanpreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.ngopidev.project.latihanpreview.adapters.ImageAdapters;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapters(this));
    }
}
