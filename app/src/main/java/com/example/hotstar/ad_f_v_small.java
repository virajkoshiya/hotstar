package com.example.hotstar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ad_f_v_small extends RecyclerView.Adapter<ad_f_v_small.viewholder> {

    int smallimg [];

    public ad_f_v_small(int[] smallimg) {
        this.smallimg = smallimg;
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_small_vertical,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        int img = smallimg[position];

       // Glide.with(holder.fVSmall.getContext()).load(img).into(holder.fVSmall);
        holder.fVSmall.setImageResource(smallimg[position]);
    }

    @Override
    public int getItemCount() {
        return smallimg.length;
    }

    public class viewholder extends RecyclerView.ViewHolder {

        private ImageView fVSmall;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            fVSmall = (ImageView) itemView.findViewById(R.id.f_v_small);
        }
    }
}
