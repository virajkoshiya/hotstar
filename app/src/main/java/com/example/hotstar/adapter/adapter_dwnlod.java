package com.example.hotstar.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.hotstar.R;
import com.example.hotstar.activity.Image_view;
import com.example.hotstar.activity.downlod_img_view;

import java.util.ArrayList;

public class adapter_dwnlod extends RecyclerView.Adapter<adapter_dwnlod.Viewholder> {
    Context context;
  //  Activity context;
    ArrayList<String> f;
            //= new ArrayList<String>();


    public adapter_dwnlod(Activity context, ArrayList<String> f) {
        this.context = context;
        this.f = f;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_img_dnlod,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        String s = f.get(position).toString();

//
    //    context.getApplicationContext().startActivity(intent);
//        Log.e("sky", "onBindViewHolder: "+s );
//
        Glide.with(context)
                .load(s)
                .apply(new RequestOptions().centerCrop())
                .into(holder.dnlodImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, downlod_img_view.class);
                 intent.putExtra("img_down",s);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return f.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView dnlodImage;



        public Viewholder(@NonNull View itemView) {
            super(itemView);

            dnlodImage = (ImageView) itemView.findViewById(R.id.dnlod_image);
        }
    }
}
