package com.example.hotstar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotstar.R;

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
