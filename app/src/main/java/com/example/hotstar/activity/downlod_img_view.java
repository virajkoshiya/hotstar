package com.example.hotstar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.hotstar.R;

public class downlod_img_view extends AppCompatActivity {
    private ImageView img;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downlod_img_view);

        img = (ImageView) findViewById(R.id.image_view);

        String st = getIntent().getStringExtra("img_down").toString();
        Glide.with(this)
                .load(st)
                .apply(new RequestOptions())
                .into(img);
    }
}