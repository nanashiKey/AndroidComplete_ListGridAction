package com.ngopidev.project.latihanpreview.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ngopidev.project.latihanpreview.R;


/**
 * created by Irfan Assidiq on 2020-01-19
 * email : assidiq.irfan@gmail.com
 **/
public class ImageAdapters extends BaseAdapter {
    private Context context;
    public Integer[] gambarKota = {
            R.drawable.bdg, R.drawable.bgr, R.drawable.jkt, R.drawable.bks,
            R.drawable.cjr, R.drawable.dpk};

    //constructor digunakan untuk membuat object ImageAdapter di class nantinya
    public ImageAdapters(Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return gambarKota.length;
    }

    @Override
    public Object getItem(int i) {
        return gambarKota[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgView = new ImageView(context);
        imgView.setImageResource(gambarKota[i]);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                200));
        return imgView;
    }
}
