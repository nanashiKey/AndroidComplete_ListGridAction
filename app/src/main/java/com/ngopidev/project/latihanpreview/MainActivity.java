package com.ngopidev.project.latihanpreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn2, btn3, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        //baru ditambahkan :
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        //anonymous inner class
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this,
//                        ListViewDenganAdapter.class);
//                startActivity(i);
//            }
//        });

        View.OnClickListener tombolKlik = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn2 : {
                        Intent i = new Intent(MainActivity.this,
                        ListViewDenganAdapter.class);
                        startActivity(i);
                    }break;
                    case R.id.btn5 : {
                        Toast.makeText(MainActivity.this, "button 5 terklik",
                                Toast.LENGTH_SHORT).show();
                    }break;
                    default:{
                        Toast.makeText(MainActivity.this, "button tidak ada",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };

        btn2.setOnClickListener(tombolKlik);
        btn5.setOnClickListener(tombolKlik);


        //menggunakan implement onclikclistener
        btn3.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    //digunakan saat menyimpan onClick di xmlnya
    public void klikbutton1(View v){
      if(v.getId() == R.id.btn1){
          Intent i = new Intent(this, ListViewTanpaAdapter.class);
          startActivity(i);
      }else if(v.getId() == R.id.btn4){
          Toast.makeText(this, "Button 4 ter klik", Toast.LENGTH_SHORT).show();
      }else{
          Toast.makeText(this, "button tidak ada", Toast.LENGTH_SHORT).show();
      }

    }

    @Override
    public void onClick(View view) {
       if(view.getId() == R.id.btn3){
           Intent i = new Intent(MainActivity.this, LayoutCampuran.class);
           startActivity(i);
       }else if(view.getId() == R.id.btn6){
           Toast.makeText(this, "button 6 ter klik",
                   Toast.LENGTH_SHORT).show();
       }else {
           Toast.makeText(this, "button tidak ada",
                   Toast.LENGTH_SHORT).show();
       }
    }
}
