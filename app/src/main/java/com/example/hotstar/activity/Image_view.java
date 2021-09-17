package com.example.hotstar.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.hotstar.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Image_view extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton imageButton;

    Context context;

    Bitmap bm;
    int resourseint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = (ImageView) findViewById(R.id.image_view);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

         resourseint = getIntent().getIntExtra("bhuj",0);

         bm = BitmapFactory.decodeResource( getResources(),resourseint );


        imageView.setImageBitmap(bm);



       // Log.e("bitcheck", "onCreate: "+resourseint );

        String extStorageDirectory = Environment.getExternalStorageDirectory().toString();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {

                imgdownlod(resourseint);

              //  SharedPreferences shre = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
              ///  String previouslyEncodedImage = shre.getString("image_data", "");



            }
        });

    }

    public void imgdownlod(int id){


//        Random random=new Random();
//        int name=random.nextInt(12345);

        String root=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+"/Image_File";
        File dir=new File(root);
        dir.mkdir();

        File file = new File(dir, id+"UniqueFileName"+".jpg");

        try{

            OutputStream stream = null;


            stream = new FileOutputStream(file);


            bm.compress(Bitmap.CompressFormat.JPEG,100,stream);


            stream.flush();

            stream.close();

        }catch (IOException e) // Catch the exception
        {
            e.printStackTrace();
        }

        // Parse the gallery image url to uri
        //   Uri savedImageURI = Uri.parse(file.getAbsolutePath());

        // Display the saved image to ImageView
        //  iv_saved.setImageURI(savedImageURI);

        // Display saved image uri to TextView
        //  tv_saved.setText("Image saved in internal storage.\n" + savedImageURI);


        //   Log.e("bm", "onClick: "+file );
        Toast.makeText(Image_view.this, "Download click", Toast.LENGTH_SHORT).show();
        //   /storage/emulated/0/Download/Image_File/8587UniqueFileName.jpg

    }

}