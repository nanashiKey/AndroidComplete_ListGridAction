package com.ngopidev.project.latihanpreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        //anonymous inner class
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,
                        ListViewDenganAdapter.class);
                startActivity(i);
            }
        });

        //menggunakan implement onclikclistener
        btn3.setOnClickListener(this);
    }

    //digunakan saat menyimpan onClick di xmlnya
    public void klikbutton1(View v){
        Intent i = new Intent(this, ListViewTanpaAdapter.class);
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, LayoutCampuran.class);
        startActivity(i);
    }
}
