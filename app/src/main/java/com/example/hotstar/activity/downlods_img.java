package com.example.hotstar.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.example.hotstar.R;
import com.example.hotstar.adapter.ad_f_v_small;
import com.example.hotstar.adapter.adapter_dwnlod;

import java.io.File;
import java.util.ArrayList;

public class downlods_img extends AppCompatActivity {
RecyclerView rec;
    ArrayList<String> f = new ArrayList<String>();// list of file paths
    public static Context context;
    downlods_img downlods_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downlods_img);
        context = this;
        rec=(RecyclerView)findViewById(R.id.downlod_recycler);

        getFromSdcard();

        adapter_dwnlod adapter_dwnlod= new adapter_dwnlod(downlods_img,f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        rec.setLayoutManager(gridLayoutManager);
        rec.setAdapter(new adapter_dwnlod(this,f));

    }



    File[] listFile;

    public void getFromSdcard()
    {
        String root=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/Image_File";
        File file= new File(root);

        if (file.isDirectory())
        {
            listFile = file.listFiles();


            for (int i = 0; i < listFile.length; i++)
            {

                f.add(listFile[i].getAbsolutePath());

            }

        }

     //   Log.e("kkk", "getFromSdcard: "+ f.get(0));
       // Log.e("guptaji", "getFromSdcard: " +file);
    }

}