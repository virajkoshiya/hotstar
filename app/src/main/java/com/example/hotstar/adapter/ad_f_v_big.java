package com.example.hotstar.adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotstar.R;
import com.example.hotstar.activity.Image_view;

public class ad_f_v_big extends RecyclerView.Adapter<ad_f_v_big.f_v_big_viewholde> {

    int imgbig [];

    public ad_f_v_big(int[] imgbig) {
        this.imgbig = imgbig;
    }

    @NonNull
    @Override
    public f_v_big_viewholde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflaterbig = LayoutInflater.from(parent.getContext());
        View vbig = inflaterbig.inflate(R.layout.item_big_vertical,parent,false);

        return new f_v_big_viewholde(vbig);
    }

    @Override
    public void onBindViewHolder(@NonNull f_v_big_viewholde holder, int position) {

      //int img_big = imgbig[position];

      holder.fVbig.setImageResource(imgbig[position]);

      holder.fVbig.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(v.getContext(), Image_view.class);
              int int_f_v_big = imgbig[position];
              //Log.e("int_f_v_big", "onClick: "+ int_f_v_big);
              intent.putExtra("bhuj",int_f_v_big);
              v.getContext().startActivity(intent);
          }
      });
    }

    @Override
    public int getItemCount() {
        return imgbig.length;
    }

    public class f_v_big_viewholde extends RecyclerView.ViewHolder {
        private ImageView fVbig;


        public f_v_big_viewholde(@NonNull View itemView) {
            super(itemView);

            fVbig = (ImageView)itemView.findViewById(R.id.f_v_big);


        }
    }
}
